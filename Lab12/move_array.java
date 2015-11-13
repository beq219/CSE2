import java.util.Scanner;//I am importing my scanner class

public class move_array{//This is my main class
    public static void main(String[] args){//This is my main method
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("Enter the size of the array: ");
    int size = myScanner.nextInt();
    int[] array1 = null;
    
    try{
        array1 = new int[size];
    }catch(Exception e){
        System.out.println("Invalid Input");
    }
    
    for(int i = 0; i < array1.length; i++){
        array1[i]=(int)(Math.random()*100);
        System.out.print(array1[i] + " ");
    }
    
    System.out.print("Enter the index of the value to be moved: ");
    int moveIndex = myScanner.nextInt();
    int temp = 0;
    try{
        temp = array1[moveIndex];
    }catch(Exception e){
        System.out.println("Invalid Input");
    }
    
    int i = 0;
    for(i = moveIndex; i < array1.length - 1; i++){
        array1[i] = array1[i + 1];
    }
    array1[size - 1] = temp; 
    
    
    for(i = 0; i < array1.length; i++){
        System.out.print(array1[i] + " ");
}
}
}