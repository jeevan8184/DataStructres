package BianarySearchTree;

import java.util.*;

public class MergeBSTS {
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

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null)
            return;
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    //
    public static Node creaeBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = creaeBST(arr, start, mid - 1);
        root.right = creaeBST(arr, mid + 1, end);
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        //
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }
        Node root = creaeBST(finalArr, 0, finalArr.size() - 1);
        return root;

    }

    // RangeSumof BST
    public static int rangeSum(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr.data >= low && curr.data <= high) {
                sum += curr.data;
            }
            if (curr.data > low && curr.left != null) {
                q.add(curr.left);
            }
            if (curr.data < high && curr.right != null) {
                q.add(curr.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
        System.out.println();

        System.out.println(rangeSum(root, 2, 12));
    }
}
