package TreeNode;

public class isSymmetric {

    public static boolean IsSymmetric(TreeNode root){
       return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode Tree1, TreeNode Tree2){
        if(Tree1 == null && Tree2 == null) return true;
        if(Tree1 == null || Tree2 == null) return false;
        return (Tree1.val == Tree2.val) &&
                (isMirror(Tree1.left,Tree2.right)) &&
                (isMirror(Tree1.right,Tree2.left));
    }

    public static void main(String[] args){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(5);
        tree.right = new TreeNode(5);
        tree.left.left = new TreeNode(10);
        tree.left.right = new TreeNode(15);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(10);
        boolean isSymmetricflag;
        if (IsSymmetric(tree)) isSymmetricflag = true;
        else isSymmetricflag = false;
        System.out.println("Is Symmetric " + isSymmetricflag);
    }
}
