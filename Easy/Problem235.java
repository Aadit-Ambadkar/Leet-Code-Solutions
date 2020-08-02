class Problem235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int p1=p.val;
        int q1=q.val;
        int r1 = root.val;
        
        if (p1<r1&&q1<r1) return lowestCommonAncestor(root.left, p, q);
        else if (p1>r1&&q1>r1) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
}
