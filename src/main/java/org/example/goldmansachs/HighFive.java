package org.example.goldmansachs;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//leetcode -- 1086 - easy
public class HighFive {

    /**
     * Given a list of the scores of different students, items, where items[i] = [IDi, scorei] represents one score from a student
     * with IDi, calculate each student's top five average. Return the answer as an array of pairs result, where result[j] = [IDj,
     * topFiveAveragej] represents the student with IDj and their top five average. Sort result by IDj in increasing order.
     *A student's top five average is calculated by taking the sum of their top five scores and dividing it by 5 using integer division.
     */
    public static int[][] findMaxFiveAvg(int[][] items){

        Map<Integer, PriorityQueue<Integer>> scoresMap = new HashMap<>();

        for(int[] item: items){
            int student = item[0];
            int score = item[1];
            if(scoresMap.containsKey(student)){
                scoresMap.get(student).add(score);
            }else{
                PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
                pq.add(score);
                scoresMap.put(student,pq);
            }
        }
        int[][] result = new int[scoresMap.size()][2];
        int count = 0;
        for (Map.Entry<Integer, PriorityQueue<Integer>> scores : scoresMap.entrySet()) {
            PriorityQueue<Integer> score = scores.getValue();
            int key = scores.getKey();
            int total =0;
            for (int i=0; i<5; i++){
                total += (int) score.poll();
            }
            total /=5;
           result[count] = new int[]{key, total};
           count++;
        }
        return result;


    }
}
