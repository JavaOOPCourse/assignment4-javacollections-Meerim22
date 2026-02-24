package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Alice", 3.7));
        students.add(new Student(2, "Bob", 1.8));
        students.add(new Student(3, "Charlie", 2.9));
        students.add(new Student(4, "Diana", 3.95));
        students.add(new Student(5, "Ethan", 1.6));
    }

    public void removeLowGPA() {
        students.removeIf(student -> student.getGpa() < 2.0);
    }

    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }

        System.out.println("Highest GPA student: " + topStudent);
    }

    public void insertAtIndex() {
        students.add(2, new Student(6, "Farida", 3.3));
    }

    public void printStudents() {
        System.out.println("Students:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
