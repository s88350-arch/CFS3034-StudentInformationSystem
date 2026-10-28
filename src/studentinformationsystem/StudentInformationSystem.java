/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 * Author: Siti Nur Syazwani Ahmad
 * Program Nmae: StudentInformationSystem.java
 * Description: To display a student's basic information and calculate a simple result from two marks
 * Date: 28 October 2026
 * Modified Date: None
 * Version:1.0
 */
import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // i. Display student name and student ID
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        // ii. Store two marks using variables
        System.out.print("Enter Mark 1: ");
        double mark1 = scanner.nextDouble();
        
        System.out.print("Enter Mark 2: ");
        double mark2 = scanner.nextDouble();

        // iii. Calculate the total mark
        double totalMark = mark1 + mark2;

        // Print Student Profile Summary
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        
        // iv. Display the total
        System.out.println("Total Mark: " + totalMark);

        // v. Display a message based on the total
        String message;
        if (totalMark >= 80) {
            message = "Excellent";
        } else if (totalMark >= 50) {
            message = "Good";
        } else {
            message = "Needs Improvement";
        }
        System.out.println("Performance: " + message);

        scanner.close();
    }
}    

