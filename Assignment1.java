
import java.util.Scanner;

public class Assignment1{

    public static void main(String[] args) {
        // To display the name of the Assignment//

      System.out.println("Name of your Assignment: ");
      Scanner scanner = new Scanner(System.in); 
      String assignmentName = scanner.nextLine();
      
      // input student's marks for the Assignment1//
      // lets say we have 30 students,lowest marks can be 0 and highest marks can be 30//
      // lets Initialize the lowest value//
      int[] marks = new int[30];
      int highestMark = -1;
      int lowestMark = 31;
      
      for (int i = 0; i <30; i++) {  //A loop counter variable i is set to 0 and continues until i is less than 30//
          int mark; // declared the variable name 'mark'.//
          boolean validInput = false;
          
          do {
              System.out.print("Student mark" +(i +1) + ":" );
              mark = scanner.nextInt(); // stores the integer input provided bu the user in the mark variable//
              
              // for invalid input to show an error messege//
              
              if (mark < 0 || mark > 30) {
                  System.out.println("Invalid mark.");
              }
            } while (mark < 0 || mark >30);
            
            marks[i] = mark;
            
            //to update the marks//
            
            if (mark > highestMark) {
                highestMark = mark;
            }
            
            if (mark < lowestMark) {
                lowestMark= mark;
            }
            }
            
            // to print the assignment name //
            
            System.out.println("Assignment Name: " + assignmentName);
            
            // highest and lowest marks//
            
            System.out.println("Highest mark: " + highestMark);
            System.out.println(" Lowest mark: " + lowestMark);
            
            //to calculate and print the mean and standard deviation//
            
            double sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            
            double mean = sum / marks.length;
            
            double squaredDiffSum = 0;
            for (int mark : marks) {
                double diff = mark - mean;
                squaredDiffSum += diff * diff;
            }
            
            double varience = squaredDiffSum / marks.length;
            double stdDeviation = Math.sqrt(varience);
            
            System.out.println("Mean: " + mean);
            System.out.println("Standard Deviation: " + stdDeviation);
            
            scanner.close();
            }
        
    }


    
          
      
      
      
      
      
        
    
    



