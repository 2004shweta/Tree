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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }

    private static void inOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

      
        inOrderHelper(node.left, result);
        
    
        result.add(node.val);
        
       
        inOrderHelper(node.right, result);
    }


    // public static TreeNode buildTree(Integer[] values) {
    //     if (values == null || values.length == 0) return null;

    //     TreeNode root = new TreeNode(values[0]);
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);
    //     int i = 1;

    //     while (i < values.length) {
    //         TreeNode current = queue.poll();

  
    //         if (values[i] != null) {
    //             current.left = new TreeNode(values[i]);
    //             queue.offer(current.left);
    //         }
    //         i++;

    //       
    //         if (i < values.length && values[i] != null) {
    //             current.right = new TreeNode(values[i]);
    //             queue.offer(current.right);
    //         }
    //         i++;
    //     }

    //     return root;
    
    }
