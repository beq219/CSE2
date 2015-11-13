import java.util.Scanner;

public class MineSweeper{
    private static int dimensions;   //this is an instance field for keeping track of my variables
    private static int mines;
    private static char[][] arrayN;
    
    public static void main(String[] args){
        setUpBoard();
        System.out.print(seeBoard());
    }
    
    public static void setUpBoard(){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the board: ");
        dimensions = myScanner.nextInt();
        arrayN = new char[dimensions][dimensions];
        
        System.out.print("Enter the amount of mines (it should be between 1 and " + dimensions*dimensions + "): ");
        mines = myScanner.nextInt();
        placeMines(mines);
        placeNonMines();
    }
        
    public static void placeMines(int numMines){
            
            int placedMines = 0;    
            while(placedMines < numMines){
            int mineRow = (int)(Math.random()*dimensions);
            int mineCol = (int)(Math.random()*dimensions);
            
                if(arrayN[mineRow][mineCol] == 0){
                    arrayN[mineRow][mineCol] = 'M';
                    placedMines++;
                }
            }
    }
                
    public static void placeNonMines(){
        for(int row = 0; row < dimensions; row++){
            for(int col = 0; col < dimensions; col++){
                if (arrayN[row][col] == 0){
                    int numAdjMines = adjacentMines(row,col); 
                    arrayN[row][col] = (char)(numAdjMines + 48); //48 is ascii for 0
                }
            }
        }
    }

    public static int adjacentMines(int x, int y){
        int adjMines = 0;
        int row = x - 1;
        for (int i = 0; i < 3; i++){
            int col = y - 1;
            for (int j = 0; j < 3; j++){
                if ((row >= 0 && row < dimensions) && (col >= 0 && col < dimensions)){
                    if (arrayN[row][col] == 'M'){
                        adjMines++;
                    }
                }
                col++;
            }
            row++;
        }
        return adjMines;
    }
    
    public static String seeBoard(){
        String wholeBoard = "";
        for(int row = 0; row < dimensions; row++){
            String seeRow = "";
            for(int col = 0; col < dimensions; col++){ 
                seeRow += "[" + arrayN[row][col] + "]";  
            }
            wholeBoard += seeRow + "\n";
        }
        return wholeBoard;
    }
}