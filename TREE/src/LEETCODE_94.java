// class Solution {
//    private void ino(TreeNode root, List<Integer> result){
//        if(root != null){
//            ino(root.left,result);
//            result.add(root.val);
//            ino(root.right,result);
//        }
//    }
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        ino(root,result);
//        return result;
//    }
//}
