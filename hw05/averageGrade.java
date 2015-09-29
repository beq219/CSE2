//Ben Quan
//Homework 05 due October 1, 2015
//This is a program that will prompt for grades between 0 and 100. When the total grade exceeds 999, it will display the average.
//If an invalid grade is entered, the program will display "Invalid grade" and not record it.

import java.util.Scanner; //I am importing my scanner class
public class averageGrade{ //This is my main class
    public static void main(String[] args){ //This is my main method
        
        Scanner myScanner = new Scanner(System.in);  //This is my scanner
        
        double numGrade = 0; // I am declaring my variable numGrade. This will later determine the amount of grades entered.
        double gradeAverage = 0; // I am declaring my variable gradeAverage. This will store the sum each grade entered and will later produce the average of the grades.

         while(gradeAverage < 999){ //This is my while loop. It will run until gradeAverage exceeds 999.
            
            System.out.print("enter grade "); //This prompts for a grade
            double grade = myScanner.nextDouble(); //this stores what is entered into variable grade
            if(grade >= 0 && grade <= 100){ //if the grade entered is between 0 and 100, it will store the sums of the grade into gradeAverage.
                                            //it will also count how many times this loop runs.
                gradeAverage += grade; //This stores the sums of the grade into gradeAverage.
                numGrade++; //This counts how many times this loop runs.
            }
            else{ //If the grade is entered is not between 0 and 100, this will print "invalid grade".
                System.out.println("Invalid grade"); //This prints "invalid grade".
            }
            
            if(gradeAverage > 999){ //If gradeAverage exceeds 999, this will run
                System.out.println(gradeAverage / numGrade); //This prints the average of all the grades
                break; //This exits the loop
            }
           
            }
        }
}
