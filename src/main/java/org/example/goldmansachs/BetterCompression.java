package org.example.goldmansachs;

public class BetterCompression {

    // input a3c6b3a4  ==> a7b3c6 // order and no of occurances summedup
    public String betterCompression(String compressed) {

        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < compressed.length(); i++){
            char c = compressed.charAt(i);
            if(Character.isLetter(c)){
                char d = compressed.charAt(i+1);
                while(Character.isDigit(d)){
                    sb.append(d);
                    if(++i >= compressed.length() - 1)
                        break;
                    d = compressed.charAt(i+1);
                }
                arr[c-'a'] += Integer.parseInt(sb.toString());
                sb.setLength(0);
            }
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                sb.append((char) ('a' + i));
                sb.append(arr[i]);
            }
        }

        return sb.toString();

    }
}
