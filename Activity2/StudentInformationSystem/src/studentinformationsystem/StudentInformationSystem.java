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
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Display student name and student ID//
        String studentName = "Siti Nur Syazwani binri Ahmad";
        String studentID = "S88350";
        
        System.out.println("Student Name:" + studentName);
        System.out.println("Student ID: " + studentID);
        
        //Store two marks uding variables//
        double mark1 = 42.5;
        double mark2 = 45.0;
        
        //Calculate total mark//
        double totalMark = mark1 + mark2;
        
        //Display the total//
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Total Mark;" + totalMark);
        
        //Display a message based on the total//
        String performanceMessage;
        if (totalMark >= 80) {
            performanceMessage = "Excellent";
        } else if (totalMark >= 60){
            performanceMessage = "Good";
        } else {
            performanceMessage = "Need Improvement";
        }
        
        System.out.println("Performance: " + performanceMessage);
        }
    }
    

