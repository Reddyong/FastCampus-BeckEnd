package fc.datastructure.ch09;

import java.util.*;

public class AdjacencyListGraph implements IGraph {
    private List<List<Node>> graph;
    private Set<Integer> vertices;
    private Map<Integer, Integer> indegrees;

    public AdjacencyListGraph(int numOfVertex) {
        this.vertices = new HashSet<>();
        this.indegrees = new HashMap<>();
        this.graph = new ArrayList<>(numOfVertex);
        for (int i = 0; i < numOfVertex; i++) {
            this.graph.add(new ArrayList<>());
        }
    }

    @Override
    public void add(int from, int to, int distance) {
        this.vertices.add(from);
        this.vertices.add(to);

        Integer count = this.indegrees.getOrDefault(to, 0);
        this.indegrees.put(to, count + 1);

        List<Node> nodes = this.graph.get(from);
        nodes.add(new Node(from, to, distance));
    }

    @Override
    public void add(int from, int to) {
        this.vertices.add(from);
        this.vertices.add(to);

        Integer count = this.indegrees.getOrDefault(to, 0);
        this.indegrees.put(to, count + 1);

        List<Node> nodes = this.graph.get(from);
        nodes.add(new Node(from, to));
    }

    @Override
    public Integer getDistance(int from, int to) {
        List<Node> nodes = this.graph.get(from);
        for (Node node : nodes) {
            if (node.to.equals(to)) {
                return node.weight;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Integer> getIndegrees() {
        return this.indegrees;
    }

    @Override
    public Set<Integer> getVertexes() {
        return this.vertices;
    }

    @Override
    public List<Integer> getNodes(int vertex) {
        List<Integer> result = new ArrayList<>();

        for (Node node : this.graph.get(vertex)) {
            result.add(node.to);
        }
        return result;
    }

    private class Node {
        Integer from;
        Integer to;
        int weight;

        public Node(Integer from, Integer to) {
            this.from = from;
            this.to = to;
        }

        public Node(Integer from, Integer to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
}
