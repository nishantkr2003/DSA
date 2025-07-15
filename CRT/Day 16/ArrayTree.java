import java.util.*;
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int v) {
        value = v;
    }
}

public class ArrayTree {

    public TreeNode insertBST(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.value) {
            root.left = insertBST(root.left, value);
        } 
        else if (value > root.value) {
            root.right = insertBST(root.right, value);
        }
        return root;
    } 


    public TreeNode deleteBST(TreeNode root , int value){
        if(root == null){
            return null;
        }
        if(value < root.value){
            root.left = deleteBST(root.left, value);
        }
        else if(value >root.value){
            root.right = deleteBST(root.right, value);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            TreeNode successor = findMin(root.right);
            root.value = successor.value;
            root.right = deleteBST(root.right, successor.value);
            
        }
        return root;
    }

    private TreeNode findMin(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;

    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public void levelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); 
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.value + " ");

            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
                
            }
        }
    }


    public static void main(String[] args) {
        ArrayTree tree = new ArrayTree();
        TreeNode root = null;

        int[] values = {1, 2, 3, 4, 5, 6};  

        for (int val : values) {
            root = tree.insertBST(root, val);
        }

        System.out.print("Level-order traversal: ");
        tree.levelOrder(root);
        System.out.println();

        System.out.print("In-order traversal: ");
        tree.inOrder(root);                   
        System.out.println();

        System.out.println("Deleting 3");
        root = tree.deleteBST(root, 3);
        tree.levelOrder(root);  


        System.out.print("In-order after deletion: ");
        tree.inOrder(root);                   
        System.out.println();
    }
}
