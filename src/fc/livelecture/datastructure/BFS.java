package fc.livelecture.datastructure;

import java.util.*;

public class BFS {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();
    public static void main(String[] args) {
        initGraph();
        bfs(0);
    }

    private static void initGraph() {
        graph.put(0, Arrays.asList(1, 3, 6));
        graph.put(1, Arrays.asList(0, 3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList(0, 1, 2, 7));
        graph.put(4, Arrays.asList(5));
        graph.put(5, Arrays.asList(4, 6, 7));
        graph.put(6, Arrays.asList(0, 5));
        graph.put(7, Arrays.asList(3, 5));
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited.put(node, true);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();

            for (Integer cur : graph.get(poll)) {
                if (!visited.containsKey(cur)) {
                    visited.put(cur, true);
                    queue.add(cur);
                }
            }
        }
    }
}
