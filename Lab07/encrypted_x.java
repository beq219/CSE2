//Ben Quan
//Lab07 on September 18, 2015
//This is program will print out an X made of spaces inside of a grid made of *. The user is prompted to set the size.

import java.util.Scanner; //I am importing my scanner class

public class encrypted_x{ //This is my main class
    public static void main(String[] args){  //This is my main method
    
    Scanner myScanner = new Scanner(System.in); //This is my scanner
    System.out.print("Please enter a size for the X between 1 and 100: "); //The user is prompted with what's in the quotes.
    int input = myScanner.nextInt(); //This stores the input to variable input.
    
    if(input > 100 || input < 1){ //this loop makes it so that the program will exit if the user enters a number less than 1 or more than 100.
        System.out.println("Size invalid, please try again! "); //this tells the user that he/she entered a wrong number.
        System.exit(-1); //this exits the program
    }
    
    for(int i = 0; i < input; i++){ //this sets the amount of rows
        for(int j = 0; j < input; j++){ //this sets the amount of stars
            
            if((input - i) == j + 1 ){ //this prints a space depending on the row going left
                System.out.print(" ");
            }
            
            else if(i == j ){ //this prints a space depending on the row going right
                System.out.print(" ");
            }
            
            else{ //this prints a star for whenever there isn't a space
                System.out.print("*");
            }
        }
        
        System.out.println(""); //this prints each row
    }
    
    
    }
}