package org.example.practice;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxAvgScore {

    public static int findMaxAvgOfStudentScores(String[][] scores){

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<scores.length; i++){
            String name = scores[i][0];
            int value = Integer.valueOf(scores[i][1]);
            if(map.containsKey(name)){
                ArrayList<Integer> list = map.get(name);
                list.add(value);
                map.put(name,list);
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(name, list);
            }
        }
        int maxAvg = Integer.MIN_VALUE;
        for(Map.Entry<String,ArrayList<Integer>> entry: map.entrySet()){
            ArrayList<Integer> list = entry.getValue();
            int sum = 0;
            int size = list.size();
            for(Integer i : list){
                sum+=i;
            }
            int avg = sum/size;
            maxAvg = Math.max(maxAvg,avg);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAvgOfStudentScores(new String[][]{
                {"Student1","150"},
                {"student2","100"},
                {"Student1","200"},
                {"Student2","50"},
                {"Student3","50"}}));
    }


}
