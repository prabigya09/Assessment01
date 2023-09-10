
import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) {
        // To display the name of the Assignment//

      System.out.println("Enter the name of your Assignment: Assessment1");
      Scanner scanner = new Scanner(System.in); 
      String assignmentName = scanner.nextLine();
      
      // input student's marks for the Assignment1//
      // lets say we have 30 students,lowest marks can be 0 and highest marks can be 30//
      // lets Initialize the lowest value//
      int[] marks = new int[30];
      int highestMark = -1;
      int lowestMark = 31;
      
      for (int i = 0; i <30; i++) {
          int mark;
          boolean validInput = false;
          
          do {
              System.out.print("Student mark" +(i +1) + ":")
              mark = scanner.nextInt();
              
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
                lowestmark = mark;
            }
            }
            
            // to print the assignment name //
            
            System.out.println("Assignment Name: " + assignmentName);
            
            }
        
    }
}
}
    
          
      
      
      
      
      
        
    
    



