package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        if (valToInsert < root.val) {
            if (root.left == null) {
                root.left = new TreeNode<>(valToInsert);
            }
            else {
                insert(root.left, valToInsert);
            }
        }
        else {
            if (root.right == null) {
                root.right = new TreeNode<>(valToInsert);
            }
            else {
                insert(root.right, valToInsert);
            }
        }
    }
}
