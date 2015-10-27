//Ben Quan
//Homework 08
//Due 27 October 2015
//This program will prompt the user to choose circle, rectangle, or trapezoid. Then it will ask for the respective values. Then it will print out the area of each shape.
import java.util.Scanner; //I am importing my scanner class

public class areas{ //This is my main class
    
public static double area(int radius){ //this method calculates the area for a circle
    
    double areaCircle = Math.PI * Math.pow(radius,2); //this stores the area in the variable areaCircle
    System.out.println("The area of the circle is: " + areaCircle); //this prints the area of the circle
    return areaCircle; //this returns areaCricle
    
}

public static int area(int length, int width){ //this mehtod calculates the area for a rectangle
    int areaRectangle = length * width; //this stores the area in the variable areaRectangle
    System.out.println("The area of the rectangle is: " + areaRectangle); //this prints the area of the rectangle
    return areaRectangle; //this returns areaRectangle
    
}

public static double area(int height, int base1, int base2){ //this method calculates the area for a trapezoid
    double areaTrapezoid = .5*(base1 + base2)*height; //this stores the area in the variable areaTrapezoid
    System.out.println("The area of the trapezoid is: " + areaTrapezoid); //this prints the area of the trapzoid
    return areaTrapezoid; //this returns areaTrapezoid
    
}
    
    public static void main(String[] args){ //This is my main method
    Scanner myScanner = new Scanner(System.in); //This is my scanner
    String run = "x"; //I am assigning "x" to the string run for the for loop
        while(run == "x"){ //this for loop will continue to run the program until the user exits it
    
        System.out.print("enter circle, rectangle, trapezoid, or exit: "); //This prompts the user for either circle, rectange, trapezoid, or exit
        String shape = myScanner.next(); //this stores the answer to the string shape
    
        double area = 0; //I am initiating the variable area
    
            switch(shape){ //this is my switch statement
                case "circle": //this case is for the circle
                    System.out.print("enter radius: "); //this prompts the user for the radius
                    int radius = myScanner.nextInt(); //this stores the value into variable radius
                    area(radius); //this calls the method for the circle
                    break; //this breaks out of the case
            
                case "rectangle": //this case is for the recatangle
                    System.out.print("enter length: "); //this prompts the user for the length
                    int length = myScanner.nextInt(); //this stores the value into variable length
                    System.out.print("enter width: "); //this prompts the user for the width
                    int width = myScanner.nextInt(); //this stores the value into variable width
                    area(length,width); //this calls the method for the rectangle
                    break; //this breaks out of the case
                
                case "trapezoid": //this case is for the trapezoid
                    System.out.print("enter height: "); //this prompts the user for the height
                    int height = myScanner.nextInt();  //this stores the value into variable height
                    System.out.print("enter base 1: "); //this prompts the user for the first base
                    int base1 = myScanner.nextInt();  //this stores the value into variable base1
                    System.out.print("enter base 2: "); //this prompts the user for the second base
                    int base2 = myScanner.nextInt();  //this stores the value into variable base2
                    area(height,base1,base2); //this calls the method for the trapezoid
                    break; //this breaks out of the case
                
                case "exit": //this case is for the user to exit the program
                    System.exit(-1); //this exits the program
                    break; //this breaks out of the case
                
            }
        }
    }
}