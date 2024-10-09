import java.util.*;
class LEETCODE_145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        post(root,result);
        return result;

    }

    private void post(TreeNode root, List<Integer> result){
        if(root != null){
            post(root.left,result);
            post(root.right,result);
            result.add(root.val);
        }
    }

}