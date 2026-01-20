package com.university.services;

import com.university.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    /**
     * Add a new user to the system
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Get a user by ID
     */
    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Get all users
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    /**
     * Delete a user by ID
     */
    public boolean deleteUser(String userId) {
        return users.removeIf(user -> user.getUserId().equals(userId));
    }
}
