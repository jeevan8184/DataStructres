package onlyLinkedLists.folder;

public class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    // Merge Sort
    private static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private Node mergeTogether(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node midlle = findMiddle(head);
        Node rightHead = midlle.next;
        midlle.next = null;

        Node leftNode = this.mergeSort(head);
        Node rightNode = this.mergeSort(rightHead);

        return this.mergeTogether(leftNode, rightNode);
    }

    /// Zig-Zag convertion

    public void zigZag(Node head) {
        // middle
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node currNode = mid.next;
        mid.next = null;
        // reverse
        Node prevNode = null;
        Node next;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
        }
        // Zig zag
        Node leftNode = head;
        Node rightNode = prevNode;
        Node nextL, nextR;
        while (leftNode != null && rightNode != null) {
            nextL = leftNode.next;
            leftNode.next = rightNode;
            nextR = rightNode.next;
            rightNode.next = nextL;

            leftNode = nextL;
            rightNode = nextR;
        }

    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(0);
        list.addFirst(9);
        list.addFirst(2);
        // list.addFirst(6);

        list.head = list.mergeSort(list.head);
        list.printList();
        list.zigZag(list.head);
        list.printList();

    }
}
