package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i =0; i < size; i++) {
                TreeNode current = queue.poll();

                if (current.left != null) {
                    queue.add(current.left);
                }

                if(current.right !=null) {
                    queue.add(current.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
