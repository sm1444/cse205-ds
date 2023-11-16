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
    int p = 0;
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder = preorder.clone();
        Arrays.sort(inorder);
        return build(inorder,preorder,Integer.MIN_VALUE);
    }
    TreeNode build(int[] in ,int[] pre,int stop)
    {
        if(p>=pre.length) return null;
        if(in[i]==stop)
        {
            i++;
            return null;
        }
        TreeNode root = new TreeNode(pre[p++]);
        root.left = build(in,pre,root.val);
        root.right = build(in,pre,stop);
        return root;
    }
}