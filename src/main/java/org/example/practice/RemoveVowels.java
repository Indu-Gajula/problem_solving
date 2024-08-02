package org.example.practice;

public class RemoveVowels {

    public static String removeVowelsFromSmallLetterString(String str){
        StringBuilder strB = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                strB.append(c);
        }
        return strB.toString();
    }
}
