package org.example.goldmansachs;



public class Client {
    public static void main(String[] args) {

        DigitsNotMatchingInNumber.getTheNumbersWithNoMatchingDigits(10,12,2).forEach(System.out::println);
        System.out.println(StartingEnergyToCrossRoad.getTheEnergyRequiredToCrossRoad(new int[]{4,-10,-2,4,4}));
        System.out.println(TrappingRainWater.getAmountOfWaterStored(new int[]{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        System.out.println(TrappingRainWater.getUnitsOfWaterStored(new int[]{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        GenerateBinaryStrings.generateBinaryStringsInOrder(0,4, new int[4]);

    }
}
