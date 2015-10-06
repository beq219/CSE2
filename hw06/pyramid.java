//Ben Quan
//Homework 06 due October 6, 2015
//This is a program that will prompt for a size of a pyramid made of * and display it.

import java.util.Scanner; //I am importing my scanner class
public class pyramid{ //This is my main class
    public static void main(String[] args){ //This is my main method
 
    Scanner myScanner = new Scanner(System.in); //this is my scanner
    
    System.out.print("What size pyramid do you want to display? "); //i am prompting what is in the quotes.
    int size = myScanner.nextInt(); //this stores the input into the variable size
    int row = 0;  //I am initializing my variable
    int space = 0; //I am initializing my variable
    int star = 0; //I am initializing my variable
    int extraStar = 0; //I am initializing my variable
   
    for(row = 1; row <= size; row++){  //this loop is for the row
       
        for(star = 1; star <= row; star++){ //this loop is for the stars
            System.out.println("*");
        } 
        
        for(extraStar = 1; extraStar <= row - 1; extraStar++){ //this loop is also for the stars
            System.out.println("*");
        }  
        
        for(space = size - 1; space >= row; space--){ //this loop is for the spaces 
            System.out.println(" ");
        }
        
        
     
        
     System.out.println(" ");
    }
    
    
    }
}
