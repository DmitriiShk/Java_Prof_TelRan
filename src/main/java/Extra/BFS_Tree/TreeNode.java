package Extra.BFS_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    // Конструктор узла дерева
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BFSExample {

    public static void main(String[] args) {
        // Создаем дерево
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        bfs(root);
    }

    public static void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
}
