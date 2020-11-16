// The reason why BFS is a good choice (and my choice for level traversal) is because since
// you are going from the top of the stack and then the next line is left to right, like reading a book
// just like reading a book the first few chapters of the book are in your brain
// and will also be the first one out as you continue to read more chapters and forget the first
// few chapters. This applies to level traversal because it's the same exact one of going through
// each level of the binary tree and just adding it to the result line by line, left to right.

package Problem1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode<Integer> curr = queue.remove();
                currLevel.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
            result.add(currLevel);
        }
        return result;
    }
}

