package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left; // updates root to the left
            }
            else {
                root = stack.pop();
                result.add(root.val); // add that root that was popped to result list
                root = root.right; // updates root to the right
            }
        }
        return result;
    }
}
