package fc.livelecture.datastructure;

import java.util.*;

public class KeysAndRooms {
    Map<Integer, List<Integer>> map = new HashMap<>();
    boolean[] visited;
    int roomNum;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean answer = false;

        initMap(rooms);
        answer = visitingRoom(rooms);

        return answer;
    }

    private void initMap(List<List<Integer>> rooms) {
        for (int i = 0; i < rooms.size(); i++) {
            map.put(i, rooms.get(i));
        }
    }

    private boolean visitingRoom(List<List<Integer>> rooms) {
        roomNum = rooms.size();
        visited = new boolean[roomNum];

        dfs(0);

        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }

        return true;

    }

    private void dfs(int key) {
        visited[key] = true;
        List<Integer> list = map.get(key);

        for (Integer k : list) {
            if (!visited[k]) {
                dfs(k);
            }
        }
    }

    public static void main(String[] args) {
        KeysAndRooms sol = new KeysAndRooms();
        List<List<Integer>> r1 = new ArrayList<>();
        r1.add(Arrays.asList(1));
        r1.add(Arrays.asList(2));
        r1.add(Arrays.asList(3));
        r1.add(new ArrayList<>());
        List<List<Integer>> r2 = new ArrayList<>();
        r2.add(Arrays.asList(1, 3));
        r2.add(Arrays.asList(3, 0, 1));
        r2.add(Arrays.asList(2));
        r2.add(Arrays.asList(0));

        boolean solution1 = sol.canVisitAllRooms(r1);
        boolean solution2 = sol.canVisitAllRooms(r2);

        System.out.println("solution1 = " + solution1);
        System.out.println("solution2 = " + solution2);
    }
}
