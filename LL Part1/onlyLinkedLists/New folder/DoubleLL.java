package onlyLinkedLists.folder;

public class DoubleLL {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "<->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("list is Empty");
            return -1;
        }
        if (size <= 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        Node next;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prevNode;
            currNode.prev = next;

            prevNode = currNode;
            currNode = next;
        }
        head = prevNode;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printList();
        dll.reverseList();
        dll.printList();

    }

}
