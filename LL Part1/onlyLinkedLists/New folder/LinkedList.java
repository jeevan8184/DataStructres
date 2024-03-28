
public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        int x = 20;
        list.push(10);
        list.push(30);
        list.push(11);
        list.push(21);
        list.push(14);

        if (list.search(list.head, x))
            System.out.println("yes");
        else
            System.out.println("No");

    }

}
