//Ben Quan
//Due September 15, 2015
//This program will promt the user for the length width and height of a block.
//It will also calculate the surface area and volume of the block.

import java.util.Scanner; //I am importing my Scanner class
public class Block {    //this is my main class
    public static void main(String[] args ){    //this is part of my main class
        Scanner myScanner = new Scanner(System.in);     //this calls the method of the scanner
    
        System.out.print("Enter the length of the block: "); //this prompts the length of the block
        double length = myScanner.nextDouble(); //this calls the method of the scanner
        
        System.out.print("Enter the width of the block: "); //this prompts the width of the block
        double width = myScanner.nextDouble(); //this calls the method of the scanner
        
        System.out.print("Enter the height of the block: "); //this prompts the height of the block
        double height = myScanner.nextDouble(); //this calls the method of the scanner
        
        double volume = (length * width * height); //this is the formula of the volume of the block
        System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume); //this displays the volume of the block
        
        double surfaceArea = (2*(length * height)) + (2*(width * height)) + (2*(length * width)); //this is the formula for the surface area of the block
        System.out.println("The surface area of the block is " + surfaceArea); //this displays the surface area of the block
        
    }//end of main method
}//end of class.