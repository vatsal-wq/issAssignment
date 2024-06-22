//package issAssignment;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import org.apache.logging.log4j.*;
//
//class Student {
//    private String name;
//    private int id;
//
//    public Student(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;
//
//        if (id != student.id) return false;
//        return name != null ? name.equals(student.name) : student.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + id;
//        return result;
//    }
//}
//
//public class CollectionsDemo {
//    private static final Logger logger = LogManager.getLogger(CollectionsDemo.class.getName());
//
//    public static void main(String[] args) {
//        // List operations
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Virat", 1));
//        studentList.add(new Student("Rohit", 2));
//        studentList.add(new Student("Rishabh", 3));
//        logger.info("List elements:");
//        for (Student student : studentList) {
//            logger.info(student.toString());
//        }
//        studentList.remove(1); // Remove Rohit
//        logger.info("List size after removal: " + studentList.size());
//
//        // Set operations
//        Set<Student> studentSet = new HashSet<>();
//        studentSet.add(new Student("Virat", 1));
//        studentSet.add(new Student("Rohit", 2));
//        studentSet.add(new Student("Rishabh", 3));
//        studentSet.add(new Student("Virat", 1)); // Duplicate, will not be added
//        logger.info("Set elements:");
//        for (Student student : studentSet) {
//            logger.info(student.toString());
//        }
//        studentSet.remove(new Student("Rohit", 2));
//        logger.info("Set size after removal: " + studentSet.size());
//
//        // Map operations
//        Map<Integer, Student> studentMap = new HashMap<>();
//        studentMap.put(1, new Student("Virat", 1));
//        studentMap.put(2, new Student("Rohit", 2));
//        studentMap.put(3, new Student("Rishabh", 3));
//        logger.info("Map elements:");
//        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
//            logger.info("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//        studentMap.remove(2); // Remove Rohit
//        logger.info("Map size after removal: " + studentMap.size());
//    }
//}
//
