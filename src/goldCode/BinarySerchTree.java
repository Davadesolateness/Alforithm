package goldCode;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/30 20:02
 * @Version 1.0
 */
class BinaryTree1{
    int data;
    BinaryTree1 left;
    BinaryTree1 right;
    public BinaryTree1(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinarySerchTree {
    public void insert(BinaryTree1 root, int data){
        if (root.data < data){//插入在右边
            if(root.right == null){
                root.right = new BinaryTree1(data);
            }else {
                insert(root.right,data);
            }
        }else {
            if (root.left == null){
                root.left = new BinaryTree1(data);
            }else {
                insert(root.left,data);
            }
        }
    }

    public void in(BinaryTree1 root){
        if (root!=null){
            in(root.left);
            System.out.print(root.data + " ");
            in(root.right);
        }
    }

    public static void main(String[] args) {
        int data[] = {5,9,0,1,2,3,10};
        BinarySerchTree binarySerchTree = new BinarySerchTree();
        BinaryTree1 binaryTree1 = new BinaryTree1(data[0]);
        for (int i = 1; i < data.length; i++) {
            binarySerchTree.insert(binaryTree1,data[i]);
        }
        System.out.print("中序遍历为：");
        binarySerchTree.in(binaryTree1);
    }
}
