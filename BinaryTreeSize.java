public class BinaryTreeSize {

    MyBinaryTreeNode root;

    BinaryTreeSize(int value) {
        this.root = new MyBinaryTreeNode(value);
    }

    public static int countNumberOfNodes(MyBinaryTreeNode root) {
        if(root == null){
            return 0;
        }
        return countNumberOfNodes(root.left) + countNumberOfNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        BinaryTreeSize myBinaryTree = new BinaryTreeSize(7);
        myBinaryTree.root.right = new MyBinaryTreeNode(9);
        myBinaryTree.root.left = new MyBinaryTreeNode(5);
        myBinaryTree.root.right.left = new MyBinaryTreeNode(8);
        myBinaryTree.root.left.right = new MyBinaryTreeNode(6);
        System.out.print(countNumberOfNodes(myBinaryTree.root));

    }
}
