/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if( root == null){
            return res;
        }
        columnTraversal(root,0);
        // System.out.print(map.toString());
        // System.out.print(minValue);
        // if(minValue == 2147483647){
        //     minValue = 0;
        // }
        //System.out.print(maxValue);
        for( int i = minValue; i <= maxValue; i ++){
            List<Integer> k = map.get(i);
            Collections.sort(k);
            res.add(k);
        }
        return res;
    }
    public void columnTraversal(TreeNode root, int index){
        if( root.left !=null){
            minValue = Math.min(minValue,index-1);
            columnTraversal(root.left,index-1);
        }
        maxValue = Math.max(maxValue,index);
        if(map.containsKey(index)){
            List<Integer> temp = map.get(index);
            temp.add(root.val);
            map.put(index,temp);
        }else{
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            map.put(index,l);
        }
        if( root.right !=null){
            maxValue = Math.max(maxValue,index+1);
            columnTraversal(root.right,index+1);
        }
    }
}
