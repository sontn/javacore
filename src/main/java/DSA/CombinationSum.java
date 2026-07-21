package DSA;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(
                candidates,
                target,
                0,
                new ArrayList<>(),
                result
        );

        return result;
    }
    private void backtrack(
            int[] candidates,
            int remain,
            int start,
            List<Integer> current,
            List<List<Integer>> result) {

        // Tim duoc dap an
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Tong vuot qua target
        if (remain < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);

            // i thay vi i + 1 vi duoc phep dung lai phan tu
            backtrack(candidates,
                    remain - candidates[i],
                    i,
                    current,
                    result);
            current.remove(current.size() - 1);
        }

    }
    public static void main(String[] args) {

        CombinationSum solution = new CombinationSum();

        int[] candidates = {2, 3, 6, 7};

        List<List<Integer>> result =
                solution.combinationSum(candidates, 7);

        System.out.println(result);
    }
}
