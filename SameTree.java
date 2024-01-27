// Java program to check two trees are identical same or not.

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class SameTree {
 public boolean isSameTree(TreeNode p, TreeNode q) {
    // If the both trees are null, then the trees are identical
    if (p == null && q == null)
      return true;
    
    // If the one tree is null then return false
    if (p == null || q == null)
      return false;
      
    // Check the values of the tree are same or not
    if (p.val != q.val)
      return false;
      
    // Recursively calling function 
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);   
  }
  
  public static void main(String[] args) {
    SameTree t = new SameTree();
    
    // Example 1
    TreeNode p1 = new TreeNode(1);
    p1.left = new TreeNode(2);
    p1.right = new TreeNode(3);
    TreeNode q1 = new TreeNode(1);
    q1.left = new TreeNode(2);
    q1.right = new TreeNode(3);
    System.out.println(t.isSameTree(p1,q1)); // o/p: true
    
    // Example 2
    TreeNode p2 = new TreeNode(1);
    p2.left = new TreeNode(2);
    
    TreeNode q2 = new TreeNode(1);
    q2.right = new TreeNode(2);
    
    System.out.println(t.isSameTree(p2, q2)); // o/p: false
    
    // Example 3
    TreeNode p3 = new TreeNode(1);
    p3.left = new TreeNode(2);
    p3.right = new TreeNode(1);
    TreeNode q3 = new TreeNode(1);
    q3.left = new TreeNode(1);
    q3.right = new TreeNode(2);
    System.out.println(t.isSameTree(p3, q3)); // o/p: false
  }
}
