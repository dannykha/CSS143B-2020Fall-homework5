package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
       if (valToInsert < root.val) {
           if (root.left != null) {
               insert(root.left, valToInsert);
           }
           else {
               root.right = new TreeNode(valToInsert);
           }
       }
       else if (valToInsert > root.val) {
           if (root.right != null) {
               insert(root.right, valToInsert);
           }
           else {
               root.right = new TreeNode(valToInsert);
           }
       }
    }
}
