package org.example.practice.bitwise;

public class NonRepeatingNumInArrayUsingXOR {

    // using property--- XOR of NUM with 0 number itself , NUM XOR NUM --> XOR of itself is always a ZERO
    public  static int findNonRepeatingNUmInAnArray(int[] nums){
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
    // TODO need to check how it wrks with char datatype

    public static void main(String[] args) {
        System.out.println(findNonRepeatingNUmInAnArray(new int[]{1,1,4,5,3,4,5,6,6}));

    }
}

