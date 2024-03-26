package fc.datastructure.ch09;

import java.util.*;

public class GraphAlgorithms {
    public static List<Integer> bfs(IGraph iGraph, int from) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(from);
        visited.add(from);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            result.add(poll);

            for (Integer node : iGraph.getNodes(poll)) {
                if (!visited.contains(node)) {
                    queue.add(node);
                    visited.add(node);
                }
            }
        }

        return result;
    }

    public static List<Integer> dfs(IGraph iGraph, int from) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(from);
        visited.add(from);

        while (stack.size() > 0) {
            Integer pop = stack.pop();
            result.add(pop);

            for (Integer node : iGraph.getNodes(pop)) {
                if (!visited.contains(node)) {
                    stack.push(node);
                    visited.add(node);
                }
            }
        }

        return result;
    }

    public static List<Integer> topologicalSortIndegree(IGraph iGraph) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> indegrees = iGraph.getIndegrees();

        for (Integer vertex : iGraph.getVertexes()) {
            Integer count = indegrees.getOrDefault(vertex, 0);
            if (count == 0) {
                queue.add(vertex);
            }
        }

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            result.add(poll);

            for (Integer node : iGraph.getNodes(poll)) {
                if (indegrees.containsKey(node)) {
                    Integer count = indegrees.get(node);
                    if (count - 1 == 0) {
                        queue.add(node);
                    }
                    indegrees.put(node, count - 1);
                }
            }
        }

        return result;
    }

    public static List<Integer> topologicalSort(IGraph iGraph) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        Set<Integer> vertices = iGraph.getVertexes();
        for (Integer vertex : vertices) {
            if (!visited.contains(vertex)) {
                topologicalSort(iGraph, vertex, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private static void topologicalSort(IGraph iGraph, int vertex, Set<Integer> visited, Stack<Integer> stack) {
        visited.add(vertex);

        List<Integer> nodes = iGraph.getNodes(vertex);
        for (Integer node : nodes) {
            if (!visited.contains(node)) {
                topologicalSort(iGraph, node, visited, stack);
            }
        }

        stack.push(vertex);
    }

    /**
     * dijkstra shortest path algorithm
     * @param iGraph
     * @param src : start node
     * @param dst : end node
     * @return : shortest path of start node to end node
     */
    public static int dijkstraShortestPath(IGraph iGraph, int src, int dst) {
        int size = 0;
        for (Integer vertex : iGraph.getVertexes()) {
            if (size < vertex) {
                size = vertex + 1;
            }
        }

        int[] dist = new int[size];
        for (int i = 0; i < size; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        pq.add(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            int vertex = poll[0];
            int distance = poll[1];

            if (dist[vertex] < distance) {
                continue;
            }

            for (Integer node : iGraph.getNodes(vertex)) {
                if (dist[vertex] + iGraph.getDistance(vertex, node) < dist[node]) {
                    dist[node] = dist[vertex] + iGraph.getDistance(vertex, node);
                    pq.add(new int[]{node, dist[node]});
                }
            }
        }

        return dist[dst];
    }

}
