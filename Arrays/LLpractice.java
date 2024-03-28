public class LLpractice {
    Node head;

    static class Node {
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
            this.head = new Node(data);
            return;
        }

    }

    public static void main(String args[]) {
        LL list = new LL();
    }

}
