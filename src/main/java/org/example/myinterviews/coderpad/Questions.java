package org.example.myinterviews.coderpad;

import java.util.HashMap;

public class Questions {

    // 1. find missing number in a given array [0,N]
    // 2. find non-repeating char in a string
    // 3. find the max length of substring where characters of the substring is non-repeating

    // 1. find minimum positive integer missing
    // 2. Merge 2 sorted arrays
    // 3. Find Second Maximum

    // 1. secondSmallest
    // 2. Maximum Avg String[][] == {{"Student1","150"},
//                                  {"student2","100"},
//                                  {"Student1","200"},
//                                  {"Student2","50"},
//                                  {"Student3","100"}}


    public static void main(String[] args) {
            Student []arr = new Student[]{new Student("Student1","150"),
                    new Student("Student2", "100"),
                    new Student("Student1","200"),
                    new Student("Student2","50"),
                    new Student("Student3","100")};
            Questions.findMaxAvg(arr);
    }

    public static void findMaxAvg(Student[] arr){
        HashMap<String, int[]> map = new HashMap<>();
        for(Student student : arr){
            String key = student.getName();
            int score = Integer.parseInt(student.getScore());
            if(!map.containsKey(student.getName())) {
                map.put(key, new int[]{score, 1});
            }else{
              int []n = new int[]{map.get(key)[0]+score, map.get(key)[1]+1};
              map.put(key, n);
            }
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(String key : map.keySet()){
            int avg = map.get(key)[0] / map.get(key)[1] ;
            if(max<avg){
                ans = key;
                max = avg;
            }
        }
        System.out.println(ans);
    }

    public static class Student {
        String name;
        String score;

        public Student(String name, String score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }
    }
}
