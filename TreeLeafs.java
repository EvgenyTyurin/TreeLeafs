/**
 * Print and count tree leafs
 */

public class TreeLeafs {

    public static void main(String[] args) {
        // Tree init
        //           1
        //       2       3
        //     4   5
        TreeNode<String> node1 = new TreeNode<>("1");
        TreeNode<String> node2 = new TreeNode<>("2");
        TreeNode<String> node3 = new TreeNode<>("3");
        TreeNode<String> node4 = new TreeNode<>("4");
        TreeNode<String> node5 = new TreeNode<>("5");
        node1.setLeftNode(node2);
        node1.setRightNode(node3);
        node2.setLeftNode(node4);
        node2.setRightNode(node5);
        System.out.println("\nLeaf count:" + treeLeafs(node1)); // 4 5 3, count = 3
    }

    private static int treeLeafs(TreeNode node) {
        if (node == null)
            return 0;
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.print(node + " ");
            return 1;
        }
        return treeLeafs(node.getLeftNode()) + treeLeafs(node.getRightNode());
    }

}
