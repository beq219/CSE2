//Ben Quan
//Lab 08 due 21 October 2015
//This program prompts the user for 10 numbers. It will then output the median and mean of these numbers.
import java.util.Scanner; //I am importing my scanner

public class methods{ //This is my main class
    public static void main(String[] args){ //this is my main method
        Scanner myScanner = new Scanner(System.in); //this is my scanner
            
            System.out.print("Enter 10 numbers. "); //This prompts the user for 10 numbers. The numbers will then be stored in their respective variables below.
            
            System.out.print("First number? ");
            double number1 = myScanner.nextDouble();
            
            System.out.print("Second number? ");
            double number2 = myScanner.nextDouble();
            
            System.out.print("Third number? ");
            double number3 = myScanner.nextDouble();
            
            System.out.print("Fourth number? ");
            double number4 = myScanner.nextDouble();
            
            System.out.print("Fifth number? ");
            double number5 = myScanner.nextDouble();
            
            System.out.print("Sixth number? ");
            double number6 = myScanner.nextDouble();
            
            System.out.print("Seventh number? ");
            double number7 = myScanner.nextDouble();
            
            System.out.print("Eighth number? ");
            double number8 = myScanner.nextDouble();
            
            System.out.print("Ninth number? ");
            double number9 = myScanner.nextDouble();
            
            System.out.print("Tenth number? ");
            double number10 = myScanner.nextDouble();
        
        double mean = findMean(number1, number2, number3, number4, number5, number6, number7, number8, number9, number10); //this calls the findMean method
        System.out.println("The mean of these numbers is " + mean); //this prints the mean
        
        double median = findMedian(number1, number2, number3, number4, number5, number6, number7, number8, number9, number10); //this calls the findMedian method
        System.out.println("The median of these numbers is " + median); //this prints the median
    }
    
    public static double findMean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){ //this method is for the mean
        double numbersMean = (a+b+c+d+e+f+g+h+i+j) / 10; //this calculates the mean
        return numbersMean; //this returns the mean to numbersMean
        
        
    }
    public static double findMedian(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){ //this method is for the median
        double numbersMedian = (e + f) / 2; //this calculates the median
        return numbersMedian; //this returns the median to numbersMedian
    }
}