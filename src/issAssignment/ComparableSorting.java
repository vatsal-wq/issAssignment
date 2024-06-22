package issAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); // Sort by id
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


public class ComparableSorting {

	public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Chase", 3));
        studentList.add(new Student("House", 1));
        studentList.add(new Student("Foremant", 2));

        // Sorting the list of students by id (natural order)
        Collections.sort(studentList);
        System.out.println("Sorted List of Students by ID: " + studentList);
    }
}
