package fc.datastructure.ch09;

import java.util.*;

public class AdjacencyMatrixGraph implements IGraph {
    private Integer[][] matrix;
    private Set<Integer> vertices;
    private Map<Integer, Integer> indegrees;

    public AdjacencyMatrixGraph(int numOfVertex) {
        this.vertices = new HashSet<>();
        this.indegrees = new HashMap<>();
        this.matrix = new Integer[numOfVertex][];
        for (int i = 0; i < numOfVertex; i++) {
            this.matrix[i] = new Integer[numOfVertex];
        }
    }

    @Override
    public void add(int from, int to, int distance) {
        this.vertices.add(from);
        this.vertices.add(to);

        Integer count = this.indegrees.getOrDefault(to, 0);
        indegrees.put(to, count + 1);

        this.matrix[from][to] = distance;
    }

    @Override
    public void add(int from, int to) {
        this.vertices.add(from);
        this.vertices.add(to);

        Integer count = this.indegrees.getOrDefault(to, 0);
        indegrees.put(to, count + 1);

        this.matrix[from][to] = 1;
    }

    @Override
    public Integer getDistance(int from, int to) {
        return this.matrix[from][to];
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

        for (int i = 0; i < this.matrix[vertex].length; i++) {
            if (this.matrix[vertex][i] != null) {
                result.add(i);
            }
        }

        return result;
    }
}
