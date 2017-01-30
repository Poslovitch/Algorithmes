import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Input
        int[][] grille = new int[9][9];
        
        Scanner sc = new Scanner(System.in);
        for(int lines = 1 ; lines <= 9 ; lines++){
            String line = "";
            do{
                line = sc.nextLine();
            } while(line.length() != 9);
            
            for(int columns = 1 ; columns <= 9 ; columns++){
                char c = line.charAt(columns-1);
                if(Character.isDigit(c)){
                    int[lines-1][columns-1] = Integer.valueOf(c);
                }
            }
        }
        sc.close();
        
        System.out.println("Unsolved Grid:");
        displayGrid(grille);
        
        //Solving
        
        //Output
        System.out.println("Solved Grid:");
        displayGrid(grille)
    }
    
    private static void displayGrid(int[][] grid){
        // ---------
        // | |2| |7|
        // ---------
    }
}
