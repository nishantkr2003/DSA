class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int v){
        value = v;
    }
}


public class BinaryTree{
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.value + " ");
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();
        System.out.print("In-order traversal: ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("Pre-order traversal: ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("Post-order traversal: ");
        tree.postOrder(root);
        System.out.println();
    }
}