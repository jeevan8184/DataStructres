package onlyLinkedLists.folder;

import java.util.*;

public class ReerseStack {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;

    }

    public void printList() {
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;

        }
        System.out.println("NULL");

    }

    public void reverse() {

        Stack<Node> s = new Stack<>();
        Node temp = this.head;
        while (temp.next != null) {
            s.push(temp);
            temp = temp.next;
        }
        this.head = temp;

        while (!s.isEmpty()) {
            temp.next = s.peek();
            s.pop();
            temp = temp.next;
        }
        temp.next = null;

        /*
         * time : O(N) visiting every node of likedlist size n
         * space : O(N) to store the nodes in stack;
         */

    }

    public static void main(String args[]) {
        ReerseStack list = new ReerseStack();

        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();

        list.reverse();
        list.printList();

    }

}
