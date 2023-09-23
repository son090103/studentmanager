/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import library.Library;
import student.Student;

/**
 *
 * @author son
 */
public class StudentManagement {

    public ArrayList<Student> arr = new ArrayList<>();
    public Library l = new Library();
    static Scanner sc = new Scanner(System.in);

    public void create() {
        while (true) {
            int id = l.getInt("Enter ID: ");
            String name = l.getString("Enter name: ");
            String Semester = l.getString("Enter semester: ");
            String courName = l.getString("Enter courName: ");
            Student s = new Student(id, name, Semester, courName);
            arr.add(s);
            if (arr.size() > 1) {
                System.out.print("Do you want to continue (Y/N)? ");
                String continueInput = sc.nextLine().trim().toLowerCase();
                if (!continueInput.equals("y")) {
                    break;
                }
            }
        }
    }

    public void sort() {
        String name = l.getString("Enter name of Student want to search: ");
        for (Student student : arr) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student.getName() + ", " + student.getSemester() + ", " + student.getCourseName());
            }
        }
        System.out.println("sort: ");
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("List of Student: ");
        for (Student s : arr) {
            System.out.println(s.getName() + ", " + s.getSemester() + " , " + s.getCourseName());
        }
    }

    public void delete() {
        int id = l.getInt("Enter ID: ");
        System.out.println(" Do you want to update (U) or delete (D) student");
        String choice = l.getString("Enter choice: ");
        if (choice.equalsIgnoreCase("d")) {
            for (Student s : arr) {
                if (s.getID() == id) {
                    arr.remove(s);
                }
            }
        } else {
            for (Student s : arr) {
                if (s.getID() == id) {
                    String upName = l.getString("Enter name: ");
                    String upsemester = l.getString("Enter semester: ");
                    String upcourse = l.getString("Enter course: ");
                    s.setName(upName);
                    s.setSemester(upsemester);
                    s.setCourseName(upName);
                    System.out.println("Student information updated.");
                }
            }
        }
    }

    public void report() {
        Map<String, Map<String, Integer>> studentCourseCountMap = new HashMap<>();

        // Count the total number of courses for each student
        for (Student student : arr) {
            String studentName = student.getName();
            String courseName = student.getCourseName();

            Map<String, Integer> courseCountMap = studentCourseCountMap.getOrDefault(studentName, new HashMap<>());
            // sử dụng để truy xuất liên kết với khóa 
            int courseCount = courseCountMap.getOrDefault(courseName, 0);
            courseCountMap.put(courseName, courseCount + 1);

            studentCourseCountMap.put(studentName, courseCountMap);
        }

        System.out.println("\nStudents with Total Courses:");
        for (Map.Entry<String, Map<String, Integer>> entry : studentCourseCountMap.entrySet()) {
            String studentName = entry.getKey();
            Map<String, Integer> courseCountMap = entry.getValue();

            for (Map.Entry<String, Integer> courseCountEntry : courseCountMap.entrySet()) {
                String courseName = courseCountEntry.getKey();
                int courseCount = courseCountEntry.getValue();

                System.out.println("Student Name: " + studentName + ", Course: " + courseName + ", Count: " + courseCount);
            }
        }
    }
    public void display(){
        for(Student s : arr){
            System.out.println(s);
        }
    }
}
