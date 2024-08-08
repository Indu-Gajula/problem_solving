package org.example.goldmansachs;

// 443 - medium // happy... i solved it in one go ...// can be modified later for modularity
public class CompressString {
    public static int compress(char[] chars) {

        if(chars.length == 1){
            return 1;
        }
        int charsPosition = 0 ;
        int start =0;
        char prev = chars[0];
        for(int i=0; i<chars.length; i++){
            if(prev != chars[i]){
                chars[charsPosition++] = prev;
                int noOfTimes = i-start;
                if(noOfTimes > 1){
                    String str = String.valueOf(noOfTimes);
                    int n = str.length();
                    int k=0;
                    while(k<n){
                        chars[charsPosition++] = str.charAt(k);
                        k++;
                    }
                }
                prev = chars[i];
                start = i;
            }
        }
        chars[charsPosition++] = chars[chars.length-1];
        if(chars.length-start > 1){
            String str = String.valueOf(chars.length-start);
            int n = str.length();
            int k=0;
            while(k<n){
                chars[charsPosition++] = str.charAt(k);
                k++;
            }
        }

        return charsPosition;
    }


    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
    }
}
