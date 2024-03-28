package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class pqImlement {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            // descending order
            return s2.rank - this.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 5));
        pq.add(new Student("B", 9));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 7));
        pq.add(new Student("E", 8));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
        System.out.println();

    }

}
