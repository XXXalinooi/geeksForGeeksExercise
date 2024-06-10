public class SearchANodeInBTS {
    public static boolean searchNodeInBTS(BinaryTreeNode head, int valueToFind){
        if(head.key == valueToFind){
            return true;
        }
        if(head.left == null && head.right == null){
            return false;
        }
        else if(valueToFind > head.key){
            return searchNodeInBTS(head.right, valueToFind);
        }
        else {
            assert head.left != null;
            return searchNodeInBTS(head.left, valueToFind);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(81);
        tree.root.right.left = new BinaryTreeNode(42);
        tree.root.right.right = new BinaryTreeNode(87);
        tree.root.right.left.right = new BinaryTreeNode(66);
        tree.root.right.right.right = new BinaryTreeNode(90);
        tree.root.right.left.right.left = new BinaryTreeNode(45);
        System.out.println(searchNodeInBTS(tree.root, 42));
    }
}
