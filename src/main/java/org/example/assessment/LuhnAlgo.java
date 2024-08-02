package org.example.assessment;


import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.IntStream;
@Component
public class LuhnAlgo {

   public static boolean isAValidCard(String cardNumber){

       boolean isSecond = false;
       int sum=0;


       for(int i = cardNumber.length()-1; i>=0; i-- ) {
           int digit = Character.getNumericValue(cardNumber.charAt(i));
//           int digit = cardNumber.charAt(i) - '0' ;
           if (isSecond)
               digit *= 2;
           sum += digit / 10;
           sum += digit % 10;

           isSecond = !isSecond;
       }
       return sum%10==0;
    }



    public static int isAValidCardWithoutFlag(String cardNumber){

        int sum = 0;
        int len = cardNumber.length();
        for(int i = len-1; i>=0; i-- ) {
          var digit = Character.getNumericValue(cardNumber.charAt(i));
            if ((len - i)%2 == 0){
                digit *= 2;
                digit = digit > 9 ? digit-9: digit;
            }
            sum+=digit;

        }
        return sum;
    }

    public static boolean isAValidCardWithIntStream(String cardNumber){

       int len = cardNumber.length();
       int sum = IntStream.range(0,len)
                .map(i -> {
                            int digit = Character.getNumericValue(cardNumber.charAt(len-1-i));
                            if(i%2==1) digit *= 2;
                            digit = digit > 9 ? digit-9 : digit ;
                            return digit;
                          }
                    ).sum();


       return sum%10==0;
    }


    public static boolean isAValidCardWithStream(String cardNumber){


       final boolean[] isSecond = {true};
       return  cardNumber.chars()
                .map(c-> {
                            int digit = Character.getNumericValue( (char)c);
                            if(isSecond[0]) digit *= 2;
                            digit = digit > 9 ? digit-9 : digit ;
                            isSecond[0] = !isSecond[0];
                            return digit;
                        }
                ).sum() %10 == 0;



    }


    public static String generateCreditCardUsingLuhnAlgo(){
       StringBuilder sb = new StringBuilder();
       String prefix = "78";
       sb.append(prefix);
        Random random = new Random();
       for(int i = prefix.length()+1;i<16;i++){
           sb.append(random.nextInt(10));
       }

       int sum = isAValidCardWithoutFlag(sb.toString());
       int checkSum = (sum * 9) % 10;
       sb.append(checkSum);
       return sb.toString();
    }

    public static String isItvalid(){
        StringBuilder sb = new StringBuilder();
        String prefix = "78";
        sb.append(prefix);
        Random random = new Random();
        for(int i = prefix.length()+1;i<16;i++){
            sb.append(random.nextInt(10));
        }

        int sum = isAValidCardWithoutFlag(sb.toString());
        int checkSum = (sum * 9) % 10;
        sb.append(checkSum);
        return sb.toString();
    }




// convert  a char to int
// convert a String integer value to int

//int len = cardNumber.length()-1;
//       StringBuilder str = new StringBuilder();
//       while(len>=0){
//           str.append(cardNumber.charAt(len));
//           len = len-1;
//       }
//       String reversedStr = str.toString();



}
