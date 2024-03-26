package fc.datastructure.ch09;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IGraph {
    void add(int from, int to, int distance);
    void add(int from, int to);
    Integer getDistance(int from, int to);
    Map<Integer, Integer> getIndegrees();
    Set<Integer> getVertexes();
    List<Integer> getNodes(int vertex);
}
