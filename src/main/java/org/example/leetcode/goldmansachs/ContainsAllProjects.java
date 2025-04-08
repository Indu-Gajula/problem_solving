package org.example.leetcode.goldmansachs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContainsAllProjects {
    public static List<String> peopleWhoWorksWithAllProjects(String[][] employees){
        List<String> peopleWithAllProjects = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String []s: employees){
            set.add(s[2]);
        }
        HashMap<String,HashSet<String>> map = new HashMap<>();
        for(String []s: employees){
            if(!map.containsKey(s[0])){
                map.put(s[0], new HashSet<>());
            }
            map.get(s[0]).add(s[2]);
        }
        for(String name: map.keySet()){
            if(map.get(name).containsAll(set)){
                peopleWithAllProjects.add(name);
            }
        }
        return peopleWithAllProjects;
    }

    public static void main(String[] args) {
       List<String> peopledWhoInvolvedInAllProjects =  peopleWhoWorksWithAllProjects(new String [][]{{"Alice", "Engineering", "Project A"},
                                                        {"Alice", "Engineering", "Project B"},
                                                        {"Bob", "Engineering", "Project B"},
                                                        {"Bob", "Engineering", "Project C"},
                                                        {"Charlie", "HR", "Project A"},
                                                        {"David", "HR", "Project A"},
                                                        {"David", "HR", "Project B"},
                                                        {"Eve", "Engineering", "Project A"},
                                                        {"Eve", "Engineering", "Project C"},
                                                        {"Frank", "Marketing", "Project A"},
                                                        {"Grace", "Marketing", "Project B"},
                                                        {"Alice", "Engineering", "Project C"},
                                                         {"Bob", "Engineering", "Project A"}});


        peopledWhoInvolvedInAllProjects.forEach(System.out::println);
    }
}
