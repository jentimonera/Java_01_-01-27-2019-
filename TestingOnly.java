
import java.util.Scanner;

public class TestingOnly{

    //declare the variables
    
    public static int row, col;
    public static Scanner scan = new Scanner (System.in); //Scanner to take input from players
    public static char [][] board = new char [3][3]; //created  3 values to row, 3 values to col
    public static char turn = 'X'; // determines whose player's turn it is. Let's start with X. 
            
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    
        System.out.println("To start the game, first player must type the row number, hit enter, and type the column number.");
        System.out.println(" ");
        System.out.println( "Columns numbering is from 1 to 3, top to bottom. Row numbering is from 1 to 3, left to right." );

        //this for loop basically create 0 to 2 values of i, and 0 to 2 values of j to every i. each value of i and j are the assigned to the board array, and would print '_'
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                board [i][j] = '_';
            }
        } //see printboard below. What it does is print '| ' before j, if j=0, then '|' after the board [][]
        PrintBoard();
        Play ();
        
    }
        
        // method for play where game logic comes in.
    public static void Play () {
        boolean playing = true;
        while (playing) {
            
            boolean validMove = false;
            while (! validMove) { 
                System.out.println("Enter a row, then a column:"); 
                row = scan.nextInt() - 1; 
                col = scan.nextInt() - 1; 
                //the following statement checks if entered number is > than 3 or slot is taken
                if (row > 2 || row < 0 || col < 0 || col > 2) { 
                    System.out.println("Invalid input! Try again."); 
                } else if (board[row][col] != '_') { 
                    System.out.println("Space is already used!");
                } else { 
                    validMove = true; 
                } 
            }

            board [row][col] = turn;
            // basically saying that if GameOver returns true,based on the row and col move did on boolean Gameover, Playing will be false stopping the loop on the PLay method. 
            if (GameOver (row,col)) {
                playing = false;
                System.out.println("Game over! Player " + turn + " wins!");

            }
            // checking for a match
            if (board [0] [0] != '_' 
                && board [0] [1] != '_'
                 && board [0] [2] != '_' 
                     && board [1] [0] != '_' 
                         && board [1] [1] != '_'
                             && board [1] [2] != '_'
                                 && board [2] [0] != '_'
                                     && board [2] [1] != '_' 
                                         && board [2] [2] != '_' )
            {
                System.out.println("Game Over. It's a match.");
                break;
            }

            PrintBoard ();
            
            if (turn == 'X')
                turn = 'O';
            else
                turn = 'X';

        }
    }
    // method for printing board. 
    // It prints the board method with i and j value. 
    //The print line after the i allows a new line. The print after j allows | before j = 0. The | is to concatinate and add border
    public static void PrintBoard () {
        for (int i=0; i<3; i++) {
            System.out.println();
            for (int j =0; j<3; j++) {
                if (j==0)
                    System.out.print("| ");
                System.out.print( board [i][j]+ " | ");
            }
        }
        System.out.println();
    }
    
    // method to trigger game over for winner
    public static boolean GameOver (int rMove, int cMove) {
     //checking for horizontal and vertical wins

        
        if ( (board[0][cMove] == board[1][cMove]) && (board[0][cMove] == board[2][cMove]) )
            return true;
        if (board [rMove][0]  == board [rMove][1] && board [rMove][0] ==     board [rMove][2])
            return true;
     //checking for diagonal wins
        if (board [0][0] == board [1][1] && board [0][0] == board [2][2] && board [1][1] != '_')
            return true;
        if (board [0] [2] == board [1][1] && board [0][2] == board [2][0] && board [1][1] != '_')    
            return true;

        return false;  
    } 
}
        
        /*
         * public static allows the method be accessed by the main method
         * void has no return type. It means that what ever is written within the curly braces will happen.
         * boolean has a return type. It has to be initialized ex: public static boolean GameOver (int rMove, int cMove) {return false;}
         * 
         */