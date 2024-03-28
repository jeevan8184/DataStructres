package onlyLinkedLists.folder;

import java.util.LinkedList;

public class LengthOfLL {
    Node head;
    static int cnt;

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
            System.out.println("List Empty()");
            return;
        }

        Node currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getcount() {
        Node temp = this.head;
        if (temp == null) {
            return 0;
        }

        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

    }

}
