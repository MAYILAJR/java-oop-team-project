University Course Management System

GROUP MEMEBERS: 29345/2025 -- User Management (Component 1) 30620/2025 -- User Management (Component 1) 29912/2025 -- Course Management (Component 2) 25906/2024 -- Enrollment System (Component 3) 29611/2025 -- Grade Management (Component 4) 29179/2025 -- Notification System (Component 5) 29542/2025 -- Reporting System (Component 6) 30755/2025 -- Authentication & Data Persistence (Components 7 & 8)

📌 Project Overview

A console-based Java application designed for university management. The system allows the management of users (students, instructors, administrators), courses, enrollments, grades, notifications, reports, authentication, and data persistence.

The project applies the fundamental principles of Object-Oriented Programming (OOP):

Encapsulation

Inheritance

Polymorphism

Abstraction

👥 Team Organization and Work Distribution

Each student is responsible for a specific component of the system. Below is the work completed by each member before the final integration of the project.

👤 29345/2025 — User Management (Component 1)

I worked on defining the different types of users in the system. My main focus was on modeling students, instructors, and administrators in a way that reflects their real roles within a university. I made sure each user type had its own specific data and behavior while still sharing common features.

Overview:
Worked on implementing the core user models of the University Course Management System. The goal was to clearly define user roles and make the system flexible enough to handle different types of users.

Work Done:

Implemented Student, Instructor, and Admin classes

Extended a common User base class

Added role-specific attributes and behaviors

Overrode methods to display user information correctly

Contribution Impact:
This work allows the system to clearly distinguish between different users and supports role-based features across the application.

OOP Principles Applied:

Inheritance: User subclasses extend a common base class

Polymorphism: Different user types respond differently to the same methods

👤 30620/2025 — User Management (Component 1)

I focused on managing users once they are created in the system. I worked on handling operations such as adding, updating, and removing users while keeping user data well protected and organized.

Overview:
Contributed to the management side of users by implementing logic that allows the system to maintain and control user information efficiently.

Work Done:

Implemented user creation and update logic

Added search and delete functionalities

Used getters and setters to protect user data

Ensured consistent handling of user records

Contribution Impact:
This part makes it easy to maintain user information and ensures the system remains organized as it grows.

OOP Principles Applied:

Encapsulation: Controlled access to user data

Inheritance: Worked with user subclasses

👤 29912/2025 — Course Management (Component 2)

I was responsible for handling course-related features in the system. I focused on making sure courses are well defined, valid, and easy to manage.

Overview:
Worked on the course management logic to ensure courses are created, validated, and organized correctly within the system.

Work Done:

Implemented the CourseManager class

Improved the Course class structure

Added validation for credits and instructors

Worked on prerequisite handling

Added filtering by department and instructor

Contribution Impact:
This makes course data reliable and easier to manage for both instructors and administrators.

Component 3: Enrollment System

Implemented by: 25906/2024

Overview
Worked on improving the overall structure of the University Course Management System by strengthening the enrollment-related logic. Special attention was given to keeping the code clean, readable, and easy to maintain.

Work Done

Improved and organized the Student class as a core entity used during enrollment

Helped structure the project to make future feature integration easier

Ensured the enrollment-related code follows a simple and extensible design

Contribution Impact
This work laid a solid foundation for other components (such as Grades and Notifications) to integrate smoothly with the Enrollment System.

OOP Principles Applied

Encapsulation
Abstraction

👤 29611/2025 — Grade Management (Component 4)

I handled the grading part of the system by implementing different ways to calculate and assign grades. The goal was to keep the grading logic flexible and reusable.

Overview:
Worked on managing student grades and GPA calculation using multiple grading strategies.

Work Done:

Implemented letter grade, pass/fail, and numerical grading systems

Extended a common GradeCalculator base class

Assigned grades to students

Calculated GPA automatically

Contribution Impact:
This allows the system to support different grading methods without changing the core logic.

OOP Principles Applied:

Inheritance: Different calculators extend the same base class

Polymorphism: Grading behavior changes depending on the calculator used

Component 5: Notification System

Implemented by: 29179/2025

Overview
This component manages the delivery of notifications within the system. It allows the application to notify users when important events occur, such as enrollment confirmation, grade publication, or administrative announcements.

Work Done

Implemented multiple notification types (Email, SMS, In-App)

Designed a central NotificationManager to trigger notifications

Ensured flexibility to add new notification channels easily

Contribution Impact
Improves user communication and enhances the responsiveness of the system.

OOP Principles Applied

Abstraction

Polymorphism

👤 29542/2025 — Reporting System (Component 6)

I focused on generating reports that summarize academic and administrative data in a clear way.

Overview:
Worked on building reports that help users view and understand system data easily.

Work Done:

Implemented student transcripts

Created course rosters

Added teaching load reports

Generated department summaries

Contribution Impact:
These reports help students, instructors, and administrators make informed decisions.

OOP Principles Applied:

Inheritance: All reports extend a common Report class

👤 30755/2025 — Authentication & Data Persistence (Components 7 & 8)

I worked on securing the system and making sure data is stored safely. My goal was to control access to the system and prevent data loss.

Overview:
Handled authentication, authorization, and file-based data persistence for the system.

Work Done:

Implemented login using username and password

Added role-based access control

Managed user sessions

Saved and loaded users, courses, enrollments, and grades using files

Contribution Impact:
This ensures that only authorized users can access features and that system data is preserved between runs.

OOP Principles Applied:

Encapsulation: Protected sensitive data like credentials

Abstraction: Used interfaces to separate storage logic from application logic

OOP Principles Applied:

Encapsulation: Validation and controlled access to course data
