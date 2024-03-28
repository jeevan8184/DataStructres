package StacksFolder;

public class ArrayStock {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public boolean isEmpty() {
        return head == null;
    }

    // push
    public static void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop
    public static int pop() {
        if (head == null) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    // peek
    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        ArrayStock s = new ArrayStock();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}
