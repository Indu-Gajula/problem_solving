package org.example.goldmansachs;

//3168 - easy
public class MiniMumChairs {

    public int minimumChairs(String s) {
        int ans = 0;
        int count=0;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == 'E'){
                count++;
            }else{
                count--;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}

