package tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    private final BinaryTree tree = new BinaryTree();
    @Test
    void isMirror(){
        Assertions.assertTrue( Mirror.isMirror(null,null));
        Assertions.assertFalse( Mirror.isMirror(null,new TreeNode(1)));
        Assertions.assertTrue( Mirror.isMirror(new TreeNode(1),new TreeNode(1)));
        Assertions.assertFalse(Mirror.isMirror(tree.buildTree(),tree.buildTree()));
        Assertions.assertTrue(Mirror.isMirror(tree.buildTree(),tree.buildMirrorTree()));
    }


}
