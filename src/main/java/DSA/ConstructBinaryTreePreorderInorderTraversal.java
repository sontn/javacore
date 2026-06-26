package DSA;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorderInorderTraversal {
    int preorderIndex = 0;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Luu vi tri inorder de tim nhanh
        for (int i = 0; i < inorder.length;i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) return null;

        // Lay root tu preorder
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Tim root trong inorder
        int mid = map.get(rootVal);

        // Build left
        root.left = build(preorder, left, mid -1);

        // Build right
        root.right = build(preorder, mid + 1, right);

        return root;
    }
}
