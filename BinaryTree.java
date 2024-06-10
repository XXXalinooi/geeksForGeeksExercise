public class BinaryTree {
    BinaryTreeNode root;
    BinaryTree() {
        root = null;
    }

    BinaryTreeNode createBalancedBinaryTree( BinaryTreeNode treeRoot, int numberToInsert){
        if (treeRoot == null) {
            return (new BinaryTreeNode(numberToInsert));
        }
        else {
            if (numberToInsert <= treeRoot.key) {
                treeRoot.left = createBalancedBinaryTree(treeRoot.left, numberToInsert);
            }
            else {
                treeRoot.right = createBalancedBinaryTree(treeRoot.right, numberToInsert);
            }
            return treeRoot;
        }
    }

    int searchMinvalueInBalancedBinaryTree(BinaryTreeNode treeRoot){
        BinaryTreeNode temp = treeRoot;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.key;
    }

    static void printPreorder(BinaryTreeNode node){
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    static void printInorder(BinaryTreeNode node){
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    static void printPostorder(BinaryTreeNode node){
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    public static int countLeafs(BinaryTreeNode head){
        if(head == null){
            return 0;
        }
        if(head.left == null && head.right == null){
            return 1;
        }
        int left = countLeafs(head.left);
        int right = countLeafs(head.right);
        return left+right;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(1);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(5);
        printPreorder(tree.root);
        System.out.print(countLeafs(tree.root));
    }
}
