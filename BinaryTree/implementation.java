package BinaryTree;

import java.util.*;

public class implementation {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class treeInfo {
        int ht;
        int diam;

        public treeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // levelorderTraversal
        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static int cntOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCnt = cntOfNodes(root.left);
            int rightCnt = cntOfNodes(root.right);
            return leftCnt + rightCnt + 1;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCnt = sumOfNodes(root.left);
            int rightCnt = sumOfNodes(root.right);
            return leftCnt + rightCnt + root.data;
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHt = height(root.left);
            int rightHt = height(root.right);
            return Math.max(leftHt, rightHt) + 1;
        }

        public static int diameter(Node root) { // O(n^2)
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(Math.max(diam1, diam2), diam3);
        }

        public static treeInfo diameter2(Node root) { // O(n)
            if (root == null) {
                return new treeInfo(0, 0);
            }
            treeInfo left = diameter2(root.left);
            treeInfo right = diameter2(root.right);
            int Height = Math.max(left.ht, right.ht) + 1;
            int myDiam = Math.max(Math.max(left.diam, right.diam), left.ht + right.ht + 1);
            return new treeInfo(Height, myDiam);
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println(tree.cntOfNodes(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.height(root));
        System.out.println(tree.diameter(root));
        System.out.println(tree.diameter2(root).ht);
        System.out.println(tree.diameter2(root).diam);

    }
}
