package tree;

/*
Program to check whether two trees are mirror of themselves.
*/
public class Mirror {

    public static boolean isMirror(TreeNode source, TreeNode image){
        if(source==null && image==null)
            return true;
        if(source==null || image==null)
            return false;
        return source.getVal()==image.getVal() && isMirror(source.getLeft(),image.getRight()) &&
                isMirror(source.getRight(),image.getLeft());
    }
}
