package org.example.practice;

import java.util.HashMap;
import java.util.HashSet;

public class FirstNonOccuringChar {

    public static int getFirstNonOccuringChar(String str){

        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < str.length(); i++) {
            if(hm.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
