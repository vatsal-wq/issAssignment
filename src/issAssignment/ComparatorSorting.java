package issAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName()); // Sort by name
    }
}

public class ComparatorSorting {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 3));
        studentList.add(new Student("Bob", 1));
        studentList.add(new Student("Charlie", 2));

        // Sorting the list of students by name
        Collections.sort(studentList, new NameComparator());
        System.out.println("Sorted List of Students by Name: " + studentList);

        // Sorting the list of students by id using a lambda expression
        Collections.sort(studentList, (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
        System.out.println("Sorted List of Students by ID: " + studentList);
    }
}

