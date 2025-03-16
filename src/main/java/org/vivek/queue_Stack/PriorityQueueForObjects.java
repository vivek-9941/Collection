package org.vivek.queue_Stack;


import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
    public int rollno;

    public int marks;

    public Student(int rolllo, int marks) {
        this.rollno = rolllo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
public class PriorityQueueForObjects {
    /// here i am using the student object in my prriority q and i need to take out the top 3 students
    //from the pq based on their marks
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o2.marks - o1.marks;
            }
        });
        pq.add(new Student(1, 6));
        pq.add(new Student(2, 2));
        pq.add(new Student(3, 7));
        pq.add(new Student(4, 4));
        pq.add(new Student(5, 5));

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

