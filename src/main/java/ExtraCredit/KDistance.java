// since the distance between K to target node is just going to be K, then we can say that
// the distance between k and the child node of the target is going to be k + 1

package ExtraCredit;

import Problem1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {
        List<Integer> result = new ArrayList<>();
        if (k == 0) {
            result.add(target.val);
        }
        else {
            distanceMaker(result, root, target.val, k, 0);
        }
        return result;
    }

    private static int distanceMaker(List<Integer> result, TreeNode<Integer> root, int target, int k, int distance) {
        if (root == null) { // 0 distance
            return 0;
        }

        if (distance == k) { // 0 distance
            result.add(root.val);
            return 0;
        }

        int left, right;

        if (root.val == target || distance > 0) {
            left = distanceMaker(result, root.left, target, k, distance + 1);
            right = distanceMaker(result, root.right, target, k, distance + 1);
        }
        else {
            left = distanceMaker(result, root.left, target, k, distance);
            right = distanceMaker(result, root.right, target, k, distance);
        }

        if (root.val == target) {
            return 1;
        }

        if (left == k || right == k) {
            result.add(root.val);
            return 0;
        }
        if (left > 0) {
            distanceMaker(result, root.right, target, k, left + 1);
            return left + 1;
        }

        if (right > 0) {
            distanceMaker(result, root.left, target, k, right + 1);
            return right + 1;
        }

        return 0;
    }
}
