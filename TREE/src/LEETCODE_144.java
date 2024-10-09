//public class LEETCODE_144 {
//}
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    private void pre(TreeNode root, List<Integer> result){
//        if(root != null){
//            result.add(root.val);
//            pre(root.left,result);
//            pre(root.right,result);
//        }}
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        pre(root,result);
//        return result;
//    }
//}