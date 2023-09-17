public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;
    public int getNumberOfNonLeaves() {
        return getNumberOfNonLeaves(root);
    }
    private int getNumberOfNonLeaves(TreeNode<E> node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 0;
        }
        int leftNonLeaves = getNumberOfNonLeaves(node.left);
        int rightNonLeaves = getNumberOfNonLeaves(node.right);
        return 1 + leftNonLeaves + rightNonLeaves;
    }
}

class TreeNode<E> {
    E data;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

