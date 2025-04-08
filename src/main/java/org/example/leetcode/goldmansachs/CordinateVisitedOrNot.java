package org.example.leetcode.goldmansachs;

import java.util.HashSet;
import java.util.Objects;

public class CordinateVisitedOrNot {
    // Given a String consisting of  letters -> NWSE moves by one unit in the given direction
    // if moved in the directions given in string, return if atleast a coordinate visited twice

    // can assume we are string from 0,0
    // can assume N -> cordinate --> 0,1 in the axis
    // S -- > 0, -1
    // W --> -1, 0
    // E --> 1,0

    public static boolean isVisitedAlready(String s){
        s = s.replaceAll(" ", "");
        HashSet<Pair> hashArr = new HashSet<>();
        int x=0; int y =0;
        for(char c : s.toCharArray()){
            Pair pair = new Pair(x,y);
            hashArr.add(pair);
            switch (c){
                case 'N' -> y =y+1;
                case 'W' -> x =x-1;
                case 'S' -> y =y-1;
                case 'E' -> x =x+1;
            }
            if(hashArr.contains(new Pair(x,y))){
                return true;
            }
        }
        return false;
    }
    public  static class Pair{
        int x;
        int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public int getY() {
            return y;
        }

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


    public static void main(String[] args) {
        System.out.println(isVisitedAlready("NESESW")); // false
        System.out.println(isVisitedAlready("NESW")); // true
    }

}
