package goldCode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/22 14:28
 * @Version 1.0
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {
    public boolean isBalance(TreeNode root) {
        // write code here
        return true;
    }
    private int hight(TreeNode node) {
        if(node==null){
            return 0;
        }
        return Math.max(hight(node.right), hight(node.left))+1;
    }
}
