package org.example.assessment;

import javax.sound.midi.Soundbank;
import java.util.stream.IntStream;

public class Client {

    public static void main(String[] args) throws Exception {


        // Valid Examples for Luhn
//        System.out.println(LuhnAlgo.isAValidCard("4242424242426742"));
//        System.out.println(LuhnAlgo.isAValidCardWithoutFlag("4242424242426742"));
//        System.out.println(LuhnAlgo.isAValidCardWithIntStream("4242424242426742"));
//
//
//        // Invalid Example for Luhn Algorithm
//        System.out.println(LuhnAlgo.isAValidCardWithStream("1111111111111111"));
//        System.out.println(LuhnAlgo.isAValidCardWithoutFlag("1111111111111111"));
//        System.out.println(LuhnAlgo.isAValidCardWithIntStream("1111111111111111"));
//
//
//        System.out.println(LuhnAlgo.generateCreditCardUsingLuhnAlgo());
//        System.out.println(LuhnAlgo.isAValidCardWithIntStream(LuhnAlgo.generateCreditCardUsingLuhnAlgo()));
//
        System.out.println(Chessgame.findCurrentPlace("88",11,25));;
        System.out.println(isValidLuhn("4242424242426742"));

    }

    public static boolean isValidLuhn(String cardNbr){

        int len = cardNbr.length();
//        return IntStream.range(0,len).map(
//                                i -> {
//                                    int digit = Character.getNumericValue(cardNbr.charAt(len-1-i));
//                                    if(i%2==1){
//                                        digit *= 2;
//                                        digit = digit > 9 ? digit-9 : digit;
//                                    }
//                                    return digit;
//                                }).sum() % 10 == 0;

        int []a = {2};
        return IntStream.range(0, len).map(i -> len - i - 1)
                .map(i -> Character.getNumericValue(cardNbr.charAt(i)))
                .map(n -> n * (a[0] = a[0] == 1 ? 2 : 1) )
                .map(n ->  n > 9 ? n-9 : n)
                .sum() % 10 == 0;


    }

    public static boolean ISBNAlgo(String cardNbr){

        int len = cardNbr.length();
        return IntStream.range(0,len).map(
                i -> {
                    int digit = cardNbr.charAt(i) == 'X' ? 10 : Character.getNumericValue(cardNbr.charAt(i));
                    return digit * (len - i);
                }
        ).sum() % 11 == 0;



    }





}
