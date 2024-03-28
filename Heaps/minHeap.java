package Heaps;

import java.util.ArrayList;

public class minHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            this.arr.add(data);

            int x = this.arr.size() - 1;
            int par = (x - 1) / 2;
            while (this.arr.get(x) < this.arr.get(par)) {
                int temp = this.arr.get(x);
                this.arr.set(x, this.arr.get(par));
                this.arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return this.arr.get(0);
        }

        public boolean isEmpty() {
            return this.arr.size() == 0;
        }

        public void heapify(int i) {
            int left = 2 * i + 1, right = 2 * i + 2;
            int minIdx = i;
            while (left < this.arr.size() && this.arr.get(left) > this.arr.get(minIdx)) {
                minIdx = left;
            }
            while (right < this.arr.size() && this.arr.get(right) > this.arr.get(minIdx)) {
                minIdx = right;
            }
            if (minIdx != i) {
                int temp = this.arr.get(i);
                this.arr.set(i, this.arr.get(minIdx));
                this.arr.set(minIdx, temp);
                this.heapify(minIdx);
            }
        }

        public int remove() {
            int data = this.arr.get(0);
            int temp = this.arr.get(0);
            this.arr.set(0, this.arr.get(this.arr.size() - 1));
            this.arr.set(this.arr.size() - 1, temp);
            this.arr.remove(this.arr.size() - 1);
            this.heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
            ;
        }

    }
}
