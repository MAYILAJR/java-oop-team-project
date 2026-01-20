package com.university.users;

import java.util.HashSet;
import java.util.Set;

public class Admin extends User {

    private String adminId;
    private String department;
    private Set<String> permissions;

    public Admin(String userId, String username, String password, String email,
                 String fullName, String adminId, String department) {
        super(userId, username, password, email, fullName);
        this.adminId = adminId;
        this.department = department;
        this.permissions = new HashSet<>();
    }

    public String getAdminId() {
        return adminId;
    }

    public String getDepartment() {
        return department;
    }

    public Set<String> getPermissions() {
        return new HashSet<>(permissions);
    }

    public void addPermission(String permission) {
        permissions.add(permission);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n======== ADMIN INFORMATION =========");
        System.out.println("Admin ID: " + adminId);
        System.out.println("Name: " + getFullName());
        System.out.println("Email: " + getEmail());
        System.out.println("Department: " + department);
        System.out.println("Permissions: " + permissions.size());
        System.out.println("===================================\n");
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }
}
