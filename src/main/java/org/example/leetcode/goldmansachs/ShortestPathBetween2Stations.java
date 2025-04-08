package org.example.leetcode.goldmansachs;

import java.util.*;

class Station {
    String name;
    List<Station> neighbors;

    Station(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }
}

public class ShortestPathBetween2Stations {
    private Map<String, Station> stations;

    public ShortestPathBetween2Stations() {
        stations = new HashMap<>();
    }

    public void addStation(String name) {
        stations.putIfAbsent(name, new Station(name));
    }

    public void addConnection(String from, String to) {
        Station fromStation = stations.get(from);
        Station toStation = stations.get(to);
        fromStation.neighbors.add(toStation);
        toStation.neighbors.add(fromStation); // Undirected connection
    }

    public String findShortestPath(String start, String end) {
        Map<String, String> previous = new HashMap<>();
        Queue<Station> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(stations.get(start));
        visited.add(start);
        previous.put(start, null);

        while (!queue.isEmpty()) {
            Station current = queue.poll();
            if (current.name.equals(end)) {
                break;
            }

            for (Station neighbor : current.neighbors) {
                if (!visited.contains(neighbor.name)) {
                    visited.add(neighbor.name);
                    previous.put(neighbor.name, current.name);
                    queue.add(neighbor);
                }
            }
        }

        if (!previous.containsKey(end)) {
            return "No path found from " + start + " to " + end;
        }

        List<String> path = new ArrayList<>();
        for (String at = end; at != null; at = previous.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        return String.join(" -> ", path);
    }

    public static void main(String[] args) {
        ShortestPathBetween2Stations network = new ShortestPathBetween2Stations();
        network.addStation("A");
        network.addStation("B");
        network.addStation("C");
        network.addStation("D");
        network.addStation("E");

        network.addConnection("A", "B");
        network.addConnection("A", "C");
        network.addConnection("B", "D");
        network.addConnection("C", "E");
        network.addConnection("D", "E");

        String shortestPath = network.findShortestPath("A", "E");
        System.out.println("Shortest path (fewest stations): " + shortestPath);
    }
}