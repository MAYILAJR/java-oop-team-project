package com.university.user;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {

    private String instructorId;
    private String department;
    private String officeHours;
    private List<String> coursesTaught;

    public Instructor(String userId, String username, String password, String email,
                      String fullName, String instructorId, String department, String officeHours) {
        super(userId, username, password, email, fullName);
        this.instructorId = instructorId;
        this.department = department;
        this.officeHours = officeHours;
        this.coursesTaught = new ArrayList<>();
    }

    public String getInstructorId() {
        return instructorId;
    }

    public String getDepartment() {
        return department;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public List<String> getCoursesTaught() {
        return new ArrayList<>(coursesTaught);
    }

    public void addCourse(String courseCode) {
        if (!coursesTaught.contains(courseCode)) {
            coursesTaught.add(courseCode);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\n====== INSTRUCTOR INFORMATION ======");
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Name: " + getFullName());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Courses Taught: " + coursesTaught.size());
        System.out.println("===================================\n");
    }

    @Override
    public String getRole() {
        return "INSTRUCTOR";
    }
}
