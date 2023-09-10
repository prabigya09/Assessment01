
import java.util.Scanner;

public class Assessment1
{
    double[] studentMarks = new double [30];
    double mark;


    public static void main(String[] args) {
        // F1:To display the name of the Assignment//

      System.out.println("Name of your Assignment: ");
      Scanner scanner = new Scanner(System.in); 
      String assignmentName = scanner.nextLine();
      
      // F2:input student's marks for the Assignment1//
      // lets say we have 30 students,lowest marks can be 0 and highest marks can be 30//
      // lets Initialize the lowest value and the highest value//

      
      for (int i = 0; i <30; i++) {  //A loop counter variable i is set to 0 and continues until i is less than 30//
          int mark; // declared the variable name 'mark'.//
          boolean validInput = false;
          
          do {
              System.out.print("Student mark" +(i +1) + ":" );
              mark = scanner.nextInt(); // stores the integer input provided bu the user in the mark variable//
              
              // F3:for invalid input to show an error messege//
              
              if (mark < 0 || mark > 30) {
                  System.out.println("Invalid mark.");
              }
            } while (mark < 0 || mark >30);
            

            
               
            //F4: to print the assignment name //
            
            System.out.println("Assignment Name: " + assignmentName);

            }
            scanner.close();
        }
            
            
        
            
            // F5:highest and lowest marks//
            public double findlowestMark() {
    
            
           double lowMark= this.studentMarks[0];
           
           for(double mark : studentMarks) {
               if(mark < lowMark) {
                   lowMark = mark;
               }
           }
           
           return lowMark;
    
        }
        
        public double findhighestMark() {
            
        
        double highMark= this.studentMarks[0];
        for(double mark : studentMarks) {
            if(mark > highMark){
                highMark = mark;
            }
        }
        return highMark;
    }
        
            //F6:to calculate and print the mean and standard deviation//
            public double findmean() {
            double sum = 0;
            
            for (double mark: studentMarks){
                sum += mark;
            }
            
            double mean = sum / studentMarks.length;
            
            double squaredDiffSum = 0;
            for (double mark : studentMarks) {
                double diff = mark - mean;
                squaredDiffSum += diff * diff;
            }
            
            double varience = squaredDiffSum / studentMarks.length;
            double stdDeviation = Math.sqrt(varience); // The square root of the varience gives the standard deviation//
            
            System.out.println("Mean: " + mean); // prints the calculated mean//
            System.out.println("Standard Deviation: " + stdDeviation);// prints standard deviation//
            
            return stdDeviation;
    
    }
            }
        
        
    


    
          
      
      
      
      
      
        
    
    



