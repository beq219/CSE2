//Ben Quan
//Lab10 
//This program will prompt the user for how many values he/she wants in the array. Then the program will assign random numbers b/w 0 and 100 into the array.
//The program will then print all the values of the array, the sum and average of the values, and print all the values equal to or greater than the average.
import java.util.Scanner; //I am importing my scanner

public class Average{ //This is my main class
    public static void main(String[] args){ //this is my main method
        Scanner myScanner = new Scanner(System.in); //this is my scanner
        
        System.out.print("Enter the number of values to be stored in array: "); //This prompts the user for how many values he/she wants int he array.
        int number = myScanner.nextInt(); //this stores the value to the variable number
        
        int[] array; //this initializes the array
        array = new int[number]; //this sets the size of the array
        
        for(int i = 0; i < number; i++){ //this loop assigns random numbers to the array
            array[i] = (int)(Math.random()*100); //this is the formula for random numbers
        }
        
        for(int j = 0; j < array.length; j++){ //this loop prints out the array values
            System.out.println(array[j]); //this prints the array values
        }
        
        int sum = 0; //this initializes sum
        int average = 0; //this initializes average
        
        for(int k = 0; k < array.length; k++){ //this loops calculated the sum of the values
            sum = sum + array[k]; //this is the formula for the sum
            
        }
            System.out.println("The sum of the values is: " + sum); //this prints the sum of the values
            average = sum / array.length; //this is the formula for the average of the values
            System.out.println("The average of the values is: " + average); //this prints the average
            
        for(int l = 0; l < array.length; l++){ //this loop prints out the values in the array greater than or equal to the array
            if(array[l] >= average){ //if the values are greater than or equal to the average, they will be printed
                System.out.println("This value is greater than or equal to the average: " + array[l]); //this prints the values greater than or equal to the average
            }
        }
    }
}