
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Load data
        DataStore dataStore = FileStorage.load();

        int choice;
        do {
            System.out.println("\n--- DATA PERSISTENCE MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. View Students");
            System.out.println("4. View Courses");
            System.out.println("5. Save Data");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    dataStore.addStudent(new Student(sid, sname));
                    break;

                case 2:
                    System.out.print("Enter Course Code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter Course Title: ");
                    String title = sc.nextLine();
                    dataStore.addCourse(new Course(code, title));
                    break;

                case 3:
                    System.out.println("Students:");
                    for (Student s : dataStore.getStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 4:
                    System.out.println("Courses:");
                    for (Course c : dataStore.getCourses()) {
                        System.out.println(c);
                    }
                    break;

                case 5:
                    FileStorage.save(dataStore);
                    break;

                case 0:
                    FileStorage.save(dataStore);
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}

// ===== Supporting Classes =====

class Student implements Serializable {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class Course implements Serializable {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String toString() {
        return code + " - " + title;
    }
}

class DataStore implements Serializable {

    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public DataStore() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}
