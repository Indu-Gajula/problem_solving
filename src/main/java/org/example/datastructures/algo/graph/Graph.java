package org.example.datastructures.algo.graph;

import java.util.*;

public class Graph {

    int noOfNodes;
    List<Integer>[] neighbours;

    public Graph(int noOfNodes){
        this.noOfNodes = noOfNodes;
        this.neighbours = new LinkedList[noOfNodes];
        for (int i=0; i<noOfNodes; i++){
            neighbours[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v, boolean undirected){
        neighbours[u].add(v);
        if(undirected){
            neighbours[v].add(u);
        }
    }

    @Override
    public String toString() {
        return "Graph{" +
                "noOfNodes=" + noOfNodes +
                ", neighbours=" + Arrays.toString(neighbours) +
                '}';
    }

    void BFS(int start){
        boolean []visited = new boolean[noOfNodes];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while(queue.size() != 0){
            int curr = queue.poll();
            System.out.print(curr + "->");
            Iterator<Integer> neighbourList = neighbours[curr].iterator();
            while(neighbourList.hasNext()){
                int i = neighbourList.next();
                if(!visited[i]){
                    queue.offer(i);
                    visited[i]=true;
                }
            }
        }



    }

    public static void main(String[] args) {
        Graph graph  = new Graph(7);
        graph.addEdge(0,1,true);
        graph.addEdge(0,2,true);
        graph.addEdge(1,4,true);
        graph.addEdge(2,3,true);
        graph.addEdge(2,4,true);
        graph.addEdge(3,6,true);
        graph.addEdge(4,5,true);
        graph.addEdge(4,6,true);
        System.out.println(graph);
        graph.BFS(0);
    }



}
