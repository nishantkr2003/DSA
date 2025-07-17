import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}


public class BinaryTree{

    public void ziczagTraversal(TreeNode root){
        Stack< TreeNode> s1 = new Stack<>();
        Stack< TreeNode> s2 = new Stack<>();
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){

            while(!s1.isEmpty()){
                TreeNode current = s1.pop();
                System.out.print(current.val + " ");
                if(current.left != null){
                    s2.push(current.left);
                }
                if(current.right!=null){
                    s2.push(current.right);
                }
            }
            if(!s1.isEmpty()){
                System.out.println();
            }

            while(!s2.isEmpty()){
                TreeNode current = s2.pop();
                System.out.print(current.val + " ");
                if(current.left != null){
                    s1.push(current.left);
                }
                if(current.right!=null){
                    s1.push(current.right);
                }
                  
            }
            if(!s2.isEmpty()){
                System.out.println();
            }
        }   
    }

    public int height(TreeNode root) {
        if (root == null) return -1; 
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BinaryTree tree = new BinaryTree();
        tree.ziczagTraversal(root);
        System.out.println();
        System.out.println("height:"+tree.height(root));

    }
}