//Ben Quan
//Lab04 on September 18, 2015
//This is a calculator program using switch statements.
//This program will compute and display a+b, a-b, a*b, or a/b according to the operator.

import java.util.Scanner; //I am importing my scanner class

public class CalculatorSpecial{ //This is my main class
    public static void main(String[] args){ //This is my main method
    
        Scanner myScanner = new Scanner(System.in); //This is my scanner
        
        String y = ""; //this declares variable y. I will use this later in the do/while loop
        
        do{ //this will do this block of code once before going to the while loop
            System.out.print("Enter the first integer: "); //This prompts for the first integer
            int firstInt = myScanner.nextInt(); //This calls the method of my scanner
        
            System.out.print("Enter the second integer: "); //This prompts for the second integer
            int secondInt = myScanner.nextInt(); //This calls the method of my scanner
        
            System.out.print("Enter the operator: "); //This prompts for the operator
            String operator = myScanner.next(); //This calls the method of my scanner
            
                switch(operator){ //This is my switch statement
                
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
        
    
            System.out.print("Type n or N to stop: "); //this prompts if you want to stop 
            y = myScanner.next(); //this calls the method of my scanner
            }   while(!y.equals("n") && !y.equals("N"));{ //this is the while in the do/while. It compares y to n or N.
                    //the boom distributes through both conditions. If the input is NOT n or N, then the code will stop.
            }
             
        }
    }
