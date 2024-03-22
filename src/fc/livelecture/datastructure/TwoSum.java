package fc.livelecture.datastructure;

import java.util.*;

public class TwoSum {
    int[] answer;
    Stack<Integer> stack;
    public int[] twoSum(int[] nums, int target, int k) {

        init(k);
        dfs(0, 0, nums, target, k);

        return answer;
    }

    private void init(int k) {
        answer = new int[k];
        stack = new Stack<>();
    }

    private void dfs(int sum, int idx, int[] nums, int target, int k) {
        if (stack.size() == k) {
            if (sum == target) {
                for (int i = 0; i < stack.size(); i++) {
                    answer[i] = stack.get(i);
                }
            }
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            stack.push(i);
            dfs(sum + nums[i], i + 1, nums, target, k);
            stack.pop();
        }
    }


    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] solution1 = sol.twoSum(new int[]{2, 7, 11, 15}, 28, 3);
        int[] solution2 = sol.twoSum(new int[]{3, 2, 4}, 6, 2);
        int[] solution3 = sol.twoSum(new int[]{3, 3}, 6, 2);

        System.out.println("solution1 = " + Arrays.toString(solution1));
        System.out.println("solution2 = " + Arrays.toString(solution2));
        System.out.println("solution3 = " + Arrays.toString(solution3));
    }
}
