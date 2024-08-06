package org.example.goldmansachs;


import org.example.utility.Utility;

public class Client {
    public static void main(String[] args) {

        DigitsNotMatchingInNumber.getTheNumbersWithNoMatchingDigits(10,12,2).forEach(System.out::println);
        System.out.println(StartingEnergyToCrossRoad.getTheEnergyRequiredToCrossRoad(new int[]{4,-10,-2,4,4}));
        System.out.println(TrappingRainWater.getAmountOfWaterStored(new int[]{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        System.out.println(TrappingRainWater.getUnitsOfWaterStored(new int[]{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        GenerateBinaryStrings.generateBinaryStringsInOrder(0,4, new int[4]);

        ////        Output: [[1,87},{2,88}})
        int[][] res = HighFive.findMaxFiveAvg(new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}});
        for (int[] arr: res){
            Utility.printArray(arr);
        }




    }
}
