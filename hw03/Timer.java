//Ben Quan
//Due September 15, 2015
//This program will promt the user for the current time and the time for dinner.
//It will also calculate the amount of time remaining until dinner time.
//The time will be in military time (HHMM).

import java.util.Scanner; //I am importing my Scanner class
public class Timer {    //this is my main class
    public static void main(String[] args ){    //this is part of my main class
        Scanner myScanner = new Scanner(System.in);     //this calls the method of the scanner
        
        System.out.print("Enter the current time in the form (HHMM): "); //this prompts the current time in military time (HHMM)
            int currentTime = myScanner.nextInt(); //this calls the method of the scanner
        
        System.out.print("Enter the time you will go to dinner in the form (HHMM): "); //this promts the time that the user will go to dinner in military time (HHMM)
            int dinnerTime = myScanner.nextInt(); //this cals the method of the scanner
            
        int timeRemaining = (dinnerTime - currentTime); //this calculates the time remaining until dinner
        int hours, //hours of the time remaining
            minutes; //minutes of the time remaining
            
        hours = timeRemaining / 100; //this gets the hours of the time remaining until dinner
        minutes = (timeRemaining % 100); //this gets the minutes of the time remaining until dinner
        System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner."); //this displays the hours and minutes remaining until dinner
        
        
        
    } //end of main method

} //end of class