package org.example.goldmansachs;

//leetcode  -  1427
// easy level
public class ShiftString {


    // using char Array with O()
    public String stringShift2(String s, int[][] shift) {

        int len = s.length();
        char arr[] = s.toCharArray();
        for(int i=0; i<shift.length; i++){
            int leftOrRight = shift[i][0];
            int noOfShifts = shift[i][1]  % len;
            if(leftOrRight == 0){
                reverse(arr,0,noOfShifts-1);
                reverse(arr,noOfShifts, len-1);
                reverse(arr,0,len-1);

            }else{
                reverse(arr,len-noOfShifts, len-1);
                reverse(arr,0,len-noOfShifts-1);
                reverse(arr,0,len-1);

            }
        }
        s = String.valueOf(arr) ;
        return s;

    }

    void reverse(char[] arr, int from, int till){

        while(from < till){
            char temp = arr[from];
            arr[from] = arr[till];
            arr[till] =  temp;
            from++;
            till--;
        }

    }


    // using char array - but of O(n^2) time complexity

    public static String stringShift1(String s, int[][] shift) {

        int len = s.length();
        char arr[] = s.toCharArray();
        for(int i=0; i<shift.length; i++){
            int leftOrRight = shift[i][0];
            int noOfShifts = shift[i][1];
            if(leftOrRight == 0){
                while(noOfShifts >0){
                    char c = arr[0];
                    for(int j=0; j<len-1; j++){
                        arr[j] = arr[j+1];
                    }
                    arr[len-1] = c;
                    noOfShifts--;
                }

            }else{
                while(noOfShifts>0){
                    char c = arr[len-1];
                    for(int j=len-1; j>0; j--){
                        arr[j] = arr[j-1];
                    }
                    arr[0] = c;
                    noOfShifts--;
                }


            }
        }
        s = String.valueOf(arr) ;
        return s;

    }

    //using String builder
    public static String stringShift(String s, int[][] shift) {

        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<shift.length; i++){
            int leftOrRight = shift[i][0];
            int noOfShifts = shift[i][1];
            if(leftOrRight == 0){
                while(noOfShifts >0 ){
                    char c = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(c);
                    noOfShifts --;
                }

            }else{

                while(noOfShifts > 0 ){
                    char c = sb.charAt(len-1);
                    sb.deleteCharAt(len-1);
                    sb.insert(0,c);
                    noOfShifts --;
                }

            }
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(ShiftString.stringShift("abc", new int[][]{{0,1},{1,2}}));
        System.out.println(ShiftString.stringShift1("abc", new int[][]{{0,1},{1,2}}));
    }
}
