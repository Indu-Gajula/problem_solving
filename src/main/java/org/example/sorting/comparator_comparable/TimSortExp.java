package org.example.sorting.comparator_comparable;

import java.util.Arrays;

public class TimSortExp {
    private static final int MIN_MERGE = 32;

    private static int minRunLength(int n) {
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    private static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static int countRunAndMakeAscending(int[] array, int left, int right) {
        int runHi = left + 1;
        if (runHi == right) return 1;

        if (array[runHi++] < array[left]) {
            while (runHi <= right && array[runHi] < array[runHi - 1]) runHi++;
            reverseRange(array, left, runHi - 1);
        } else {
            while (runHi <= right && array[runHi] >= array[runHi - 1]) runHi++;
        }

        return runHi - left;
    }

    private static void reverseRange(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }

    private static void mergeAt(int[] array, int[] stack, int stackSize, int i) {
        int base1 = stack[i];
        int len1 = stack[i + 1] - stack[i];
        int base2 = stack[i + 1];
        int len2 = stack[i + 2] - stack[i + 1];

        int[] aux = new int[len1];
        System.arraycopy(array, base1, aux, 0, len1);

        int cursor1 = 0;
        int cursor2 = base2;
        int dest = base1;

        while (cursor1 < len1) {
            if (cursor2 >= base2 + len2 || aux[cursor1] <= array[cursor2]) {
                array[dest++] = aux[cursor1++];
            } else {
                array[dest++] = array[cursor2++];
            }
        }
    }

    public static void timSort(int[] array) {
        int n = array.length;
        int minRun = minRunLength(n);

        int[] stack = new int[n];
        int stackSize = 0;

        for (int i = 0; i < n;) {
            int runLen = countRunAndMakeAscending(array, i, n - 1);

            if (runLen < minRun) {
                int force = Math.min(minRun, n - i);
                insertionSort(array, i, i + force - 1);
                runLen = force;
            }

            stack[stackSize++] = i;
            i += runLen;

            while (stackSize > 1) {
                int runLen1 = stack[stackSize - 1] - stack[stackSize - 2];
                int runLen2 = (stackSize > 2) ? stack[stackSize - 2] - stack[stackSize - 3] : Integer.MAX_VALUE;

                if (runLen1 <= runLen2) {
                    mergeAt(array, stack, stackSize, stackSize - 2);
                    stackSize--;
                } else {
                    break;
                }
            }
        }

        while (stackSize > 1) {
            mergeAt(array, stack, stackSize, stackSize - 2);
            stackSize--;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 21, 7, 23, 19, 1, 3, 15, 45, 28, 30, 25};
        timSort(array);
        System.out.println(Arrays.toString(array));
    }
}
