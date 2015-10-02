
import java.util.Scanner; //I am importing my scanner class

public class timeSheets{ //This is my main class
    public static void main(String[] args){  //This is my main method
    
    Scanner myScanner = new Scanner(System.in); //This is my scanner
        int employees = 0; //I am initializing variable employees
        int singlePayroll = 0; //I am initializing variable singlePayroll
        
        System.out.print("Enter a non-negative integer specifying the number of employee timesheets to be read in: "); //this prompts what is in the quotes
        int numTimesheets = myScanner.nextInt(); //This calls the method of my scanner
        
        for(employees = 0; employees < numTimesheets; employees++){ //this for loops runs the amount depending on the number the user inputs
            System.out.print("Enter the employee's pay per hour in cents: "); //this prompts what is in the quotes
            int centsHour = myScanner.nextInt(); //This calls the method of my scanner
            
            System.out.print("Enter the number of hours the employee worked on Monday: ");  //this prompts what is in the quotes
            int mondayHours = myScanner.nextInt(); //This calls the method of my scanner
            
            System.out.print("Enter the number of hours the employee worked on Tuesday: ");  //this prompts what is in the quotes
            int tuesdayHours = myScanner.nextInt(); //This calls the method of my scanner
            
            System.out.print("Enter the number of hours the employee worked on Wednesday: ");  //this prompts what is in the quotes
            int wednesdayHours = myScanner.nextInt(); //This calls the method of my scanner
            
            System.out.print("Enter the number of hours the employee worked on Thursday: ");  //this prompts what is in the quotes
            int thursdayHours = myScanner.nextInt(); //This calls the method of my scanner
            
            System.out.print("Enter the number of hours the employee worked on Friday: ");  //this prompts what is in the quotes
            int fridayHours = myScanner.nextInt(); //This calls the method of my scanner
            
            singlePayroll = centsHour * (mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours);  //this calculates the payroll for one employee
            
            
        }
        int totalPayroll = singlePayroll * numTimesheets;  //this calculates the payroll for all of the employees
        System.out.println("The total payroll of all employees is: " + totalPayroll); //this prints out the payroll for all the employees
    
    }
}