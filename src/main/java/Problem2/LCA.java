// The given two nodes always exist in the given tree
// All nodes in a given tree have unique values.

package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode<Integer> left = lowestCommonAncestor( root.left,  p,  q);
        TreeNode<Integer>  right = lowestCommonAncestor( root.right,  p,  q);
        if(left == null) {
            return right;
        }
        else if (right == null) {
            return left;
        }
        else {
            return root;
        }
    }
}

