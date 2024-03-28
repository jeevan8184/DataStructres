package onlyLinkedLists.folder;

public class LL1 {
    Node head;
    static int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            LL1.this.size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

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

    public void deleteFirst() {
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }
        this.size--;
        this.head = this.head.next;

    }

    public void deleteLast() {
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }
        this.size--;
        if (this.head.next == null) {
            this.head = null;
            return;
        }

        Node secondLastNode = this.head;
        Node lastNode = this.head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public int getSize() {
        return this.size;
    }

    public void reverseIterate() {
        if (this.head == null || this.head.next == null) {
            return;
        }

        Node prevNode = this.head;
        Node currNode = this.head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        this.head.next = null;
        this.head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = this.reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public static void main(String args[]) {
        LL1 list = new LL1();

        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
        System.out.println("Hello");

    }

}
