package com.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Enter students
        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students.add(new Student(id, name));
        }

        // Enter courses
        System.out.print("Enter number of courses: ");
        int courseCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter course ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter course name: ");
            String name = sc.nextLine();
            courses.add(new Course(id, name));
        }

        // Enter attendance
        System.out.print("Enter number of attendance records: ");
        int recordCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < recordCount; i++) {
            System.out.print("Enter student ID for attendance: ");
            int sid = sc.nextInt();
            System.out.print("Enter course ID for attendance: ");
            int cid = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter status (Present/Absent): ");
            String status = sc.nextLine();
            attendanceLog.add(new AttendanceRecord(sid, cid, status));
        }

        // Display all attendance records
        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        sc.close();
    }
}
