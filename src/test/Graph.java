package test;

import java.util.*;

class Graph {
    private Map<String, Map<String, Integer>> graph = new HashMap<>();

    public void addNode(String node) {
        graph.put(node, new HashMap<>());
    }

    public void addEdge(String from, String to, int weight) {
        graph.get(from).put(to, weight);
        graph.get(to).put(from, weight);
    }

    public Map<String, Integer> findShortestPath(String start) {
        Map<String, Integer> distance = new HashMap<>();
        for (String node : graph.keySet()) {
            distance.put(node, Integer.MAX_VALUE);
        }
        distance.put(start, 0);

        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(distance::get));
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            for (String neighbor : graph.get(current).keySet()) {
                int newDistance = distance.get(current) + graph.get(current).get(neighbor);
                if (newDistance < distance.get(neighbor)) {
                    distance.put(neighbor, newDistance);
                    queue.add(neighbor);
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");

        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C", 7);
        graph.addEdge("A", "D", 1);
        graph.addEdge("B", "C", 3);
        graph.addEdge("B", "D", 2);
        graph.addEdge("B", "F", 2);
        graph.addEdge("C", "D", 5);
        graph.addEdge("D", "E", 2);
        graph.addEdge("D", "F", 5);
        graph.addEdge("E", "F", 1);

        String startNode = "A";
        Map<String, Integer> shortestDistances = graph.findShortestPath(startNode);

        for (String node : shortestDistances.keySet()) {
            int distance = shortestDistances.get(node);
            System.out.println("从" + startNode + "到" + node + "最短距离是" + distance);
        }
    }
}
