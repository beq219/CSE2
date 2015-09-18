//Ben Quan
//Lab04 on September 18, 2015
//This is a calculator program using switch statements.
//This program will compute and display a+b, a-b, a*b, or a/b according to the operator.

import java.util.Scanner; //I am importing my scanner class

public class Calculator //This is my main class
{
    public static void main(String[] args) //This is my main method
    {
        Scanner myScanner = new Scanner(System.in); //This is my scanner
        
        System.out.print("Enter the first integer: "); //This prompts for the first integer
        int firstInt = myScanner.nextInt(); //This calls the method of my scanner
        
        System.out.print("Enter the second integer: "); //This prompts for the second integer
        int secondInt = myScanner.nextInt(); //This calls the method of my scanner
        
        System.out.print("Enter the operator: "); //This prompts for the operator
        String operator = myScanner.next(); //This calls the method of my scanner
            
            switch(operator) //This is my switch statement
            {
                case "+": //This case is for addition
                    int sum = firstInt + secondInt; //This is the equation for addition
                    System.out.println("The sum of " + firstInt + " and " + secondInt + " is " + sum); //This prints out the sum of the first and second integers
                    break; //This is the break of the first case
                    
                case "-": //This case is for subtraction
                    int difference = firstInt - secondInt; //This is the equation for subtraction
                    System.out.println("The difference between " + firstInt + " and " + secondInt + " is " + difference); //This prints out the difference between the first and second integers
                    break; //This is the break of the second case
                
                case "*": //This is the case for multiplication
                    int product = firstInt * secondInt; //This is the equation for multiplication
                    System.out.println("The product between " + firstInt + " and " + secondInt + " is " + product); //This prints out the product of the first and second integers
                    break; //This is the break of the third case
                
                case "/": //This is the case for division
                    double quotient = (double) firstInt / (double) secondInt; //This is the equation for division. I have to cast the integers to doubles in order to divide correctly.
                    System.out.println("The quotient between " + firstInt + " and " + secondInt + " is " + quotient); //This prints out the quotient of the first and second integers
                    break; //This is the break of the fourth case
                
                default: //This is the default case
                    System.out.println("Illegal operator"); //This prints that the operator is illegal
                    break; //This is the break of the default case
          
            }
            
    }
}