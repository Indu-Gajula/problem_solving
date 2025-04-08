package org.example.leetcode.goldmansachs;

public class PangramDetector {
    // considering only lowercase letters

    public static boolean isPangram(String sentence){
        boolean []exists = new boolean[26];
        String regex = "[^a-z]";
//        sentence = sentence.replace(" ", "");
        sentence = sentence.replaceAll(regex,"");
        for (char c : sentence.toCharArray()){
            exists[c-'a'] = true;
        }
        for (int i=0; i<exists.length;i++){
            if(!exists[i]){
                return false;
            }
        }
        return true;
    }
    // even more optimise version
    public static boolean isPangram1(String sentence){
        if(sentence.length() < 26){
            return false;
        }
        for (char c = 'a'; c <= 'z' ; c++) {
            if(sentence.indexOf(c) < 0){
                return false;
            }
        }
        return true;
    }
    // input is only lowercase letters in string
    public static String missingCharsForPangram(String sentence){
        String missingChars = "";
        for (char c = 'a'; c <= 'z' ; c++) {
            if(sentence.indexOf(c) < 0){
                missingChars += c;
            }
        }
        return missingChars;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("abcdefg @ # hijklmnop qrstuv wxyz"));
        System.out.println(missingCharsForPangram("abcdefghijklmnopqrstwxyz"));
    }
}
