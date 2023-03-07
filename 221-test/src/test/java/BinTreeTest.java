import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BinTreeTest {
    @Test
    public void test1(){
        BinTree root = new BinTree();
        BinTree.CreateBT("ABDCEGFHI", "DBAEGCHFI", root);
        assertTrue("ABDCEGFHI".equals(BinTree.PreOrderTraversal(root).toString()));
        assertTrue("DBAEGCHFI".equals(BinTree.InOrderTraversal(root).toString()));
        assertTrue("DBGEHIFCA".equals(BinTree.PostOrderTraversal(root).toString()));
    }

    @Test
    public void test2(){
        BinTree root = new BinTree();
        BinTree.CreateBT("ABEFCGDKIHJ", "EFBGCDAIJHK", root);
        assertTrue("ABEFCGDKIHJ".equals(BinTree.PreOrderTraversal(root).toString()));
        assertTrue("EFBGCDAIJHK".equals(BinTree.InOrderTraversal(root).toString()));
        assertTrue("FEGDCBJHIKA".equals(BinTree.PostOrderTraversal(root).toString()));
    }

}
