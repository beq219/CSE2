//this program will use a Scanner class to retreive the original cost of the check,the percentage tip, and the number of ways the check would be split
//this will also determine how much each person in the group needs to spend to pay the check
import java.util.Scanner;
public class Check {
    public static void main(String[] args){ //this is my main class
        Scanner myScanner = new Scanner(System.in); //this is my scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //this prompts the original cost of the check
            double checkCost = myScanner.nextDouble(); //this calls the method of the Scanner
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //this propmts the percentage tip that you wish to pay
            double tipPercent = myScanner.nextDouble(); //this calls the method of the Scanner
                tipPercent /= 100; //We want to convert the percentage into a decimal value
                
        System.out.print("Enter the number of people who went out to dinner: "); //this promts the number of people who went out to dinner
            int numPeople = myScanner.nextInt();//this calls the method of the Scanner
            
        double totalCost; //this is the total cost
        double costPerPerson; //this is the cost per person
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
        totalCost = checkCost * (1 + tipPercent); //this is the formula for the total cost
        costPerPerson = totalCost / numPeople; //this is the formula for the cost per person
        //get the whole amount, dropping decimal fraction
        dollars = (int)costPerPerson;
        //get dimes amount, e.g.,
        //(int)(6.73*10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the division: 583%100 -> 83, 27%5, -> 2
        dimes = (int)(costPerPerson * 10) % 10; //this is the formula for dimes
        pennies = (int)(costPerPerson * 100) % 10; //this is the formula for pennies
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //this prints out how much each person owes
        
        
    }//end of main method
}//end of class