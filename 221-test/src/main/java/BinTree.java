public class BinTree {
    private char element;
    BinTree left, right;

    public BinTree() {
    }

    BinTree(char element, BinTree left, BinTree right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    /**
     * 使用递归方法，创建一棵二叉树
     * @param pres 先序遍历字符串
     * @param ins 中序遍历字符串
     * @param t 当前树
     * @Example
     *      BinTree root = new BinTree();
     *      BinTree.CreateBT("ABDCEGFHI", "DBAEGCHFI", root);
     */
    public static void CreateBT(String pres, String ins, BinTree t){
        // please enter your code here...
        int inpos;
        String presTemp, insTemp;

        t.element = pres.charAt(0);
        inpos = 0;
        while(ins.charAt(inpos) != t.element) inpos++;

        presTemp = pres.substring(1, inpos+1);
        insTemp = ins.substring(0, inpos);
        if("".equals(presTemp)) t.left = null;
        else {
            t.left = new BinTree();
            CreateBT(presTemp, insTemp, t.left);
        }

        presTemp = pres.substring(inpos+1, pres.length());
        insTemp = ins.substring(inpos+1, ins.length());
        if("".equals(presTemp)) t.right = null;
        else {
            t.right = new BinTree();
            CreateBT(presTemp, insTemp, t.right);
        }
    }

    /**
     * 使用递归方法，先序遍历二叉树
     * @param root  当前树
     * @return  遍历后的序列
     * @Example
     *      BinTree.PreOrderTraversal(root)
     */
    public static StringBuilder PreOrderTraversal(BinTree root) {
        // please enter your code here...
        StringBuilder res = new StringBuilder("");
        if(root != null){
            res.append(root.element);
            res.append(PreOrderTraversal(root.left));
            res.append(PreOrderTraversal(root.right));
        }

        return res;
    }

    /**
     * 使用递归方法，中序遍历二叉树
     * @param root  当前树
     * @return  遍历后的序列
     * @Example
     *      BinTree.InOrderTraversal(root)
     */
    public static StringBuilder InOrderTraversal(BinTree root) {
        // please enter your code here...
        StringBuilder res = new StringBuilder();
        if(root != null){
            res.append(InOrderTraversal(root.left));
            res.append(root.element);
            res.append(InOrderTraversal(root.right));
        }

        return res;
    }

    /**
     * 使用递归方法，后序遍历二叉树
     * @param root  当前树
     * @return  遍历后的序列
     * @Example
     *      BinTree.PostOrderTraversal(root)
     */
    public static StringBuilder PostOrderTraversal(BinTree root) {
        // please enter your code here...
        StringBuilder res = new StringBuilder();
        if(root != null){
            res.append(PostOrderTraversal(root.left));
            res.append(PostOrderTraversal(root.right));
            res.append(root.element);
        }

        return res;
    }

}