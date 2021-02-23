package tree;

public class BinaryTree implements Tree{

    @Override
    public TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        return root;
    }

    public TreeNode buildMirrorTree(){
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(3));
        root.setRight(new TreeNode(2));
        return root;
    }
}
