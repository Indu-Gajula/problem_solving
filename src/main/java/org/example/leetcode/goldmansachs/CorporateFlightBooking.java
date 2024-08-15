package org.example.leetcode.goldmansachs;

import org.example.utility.Utility;

//1109 - medium
public class CorporateFlightBooking {
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        int len = bookings.length;

        for (int i = 0; i < len; i++) {
            int first = bookings[i][0] - 1;
            int second = bookings[i][1] - 1;
            int noOfSeats = bookings[i][2];
            while (first <= second) {
                ans[first] += noOfSeats;
                first++;
            }
        }
        return ans;
    }

    //optimised
    public static int[] corpFlightBookings1(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            int i = booking[0]-1;
            int j = booking[1];
            int seats = booking[2];
            ans[i] += seats;
            if (j != n)
                ans[j] -= seats;
        }

        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            ans[i] += count;
            count = ans[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        Utility.printArray(corpFlightBookings(new int[][]{{1,2,10},{2,3,20},{2,5,25}},5)); // 10 55 45 25 25
    }





}
