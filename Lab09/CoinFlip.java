//Ben Quan
//
import java.util.Scanner;//I am importing my scanner class

public class CoinFlip{//This is my main class
    public static void main(String[] args){//This is my main method
        Scanner myScanner = new Scanner(System.in);//This is my scanner
        System.out.print("Enter an integer between 0 and 100: "); //this prompts the user for an integer between 0 and 100
        int n = myScanner.nextInt(); //this stores the value in variable n
        if(n == 0){ //If n is 0, then it will call the flip() method
            flip(); //this calls the flip() method
        }
        else{ //if n is less than 0 or more than 100, then the program will display "Invalid Number" and exit
            if(n < 0 || n > 100){//if n is less than 0 or more than 100, then the program will display "Invalid Number" and exit
                System.out.println("Invalid number"); //this displays "Invalid number"
                System.exit(-1); //this exits the program
            }
            else{ //this will call the method flip(n) if n is greater than 0
                flip(n); //this calls the method flip(n)
            }
        }
    }
    public static void flip(){ //this method simulates a coin flip once
        double x = 0;  //i am initiating variable x
        x = Math.round(Math.random()); //this rounds a random number between 0 and 1
        if(x == 0){ //if the value is 0, then it will print "tails"
            System.out.println("tails"); //this prints "tails"
            
        }
        else{ //if the value is 1, then it will print "heads"
            System.out.println("heads"); //this prints "heads"
            
        }
        
    }
    public static void flip(int n){ //this method is for more than one coinflip
        
        for(int i = 0; i < n; i++){ //this for loop will run the flip() method n number of times
            flip(); //this calls the flip() method
        
        }
       
    }
}