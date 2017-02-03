package java;

import java.util.Random;
import java.util.Scanner;

public class PlusOuMoins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le chiffre maximal:");
        int max = sc.nextInt();
        
        int random = new Random().nextInt(max+1);
        
        System.out.println("Bonne chance!");
        int try = -1;
        int essais = 0;
        do{
            try = sc.nextInt();
            if(try < random) System.out.println("Plus grand!");
            else if(try > random) System.out.println("Plus petit!");
            essais++;
        } while(try != random);
        
        System.out.println("Bravo!");
        System.out.println("Vous avez réussi en " + essais + " essais!");
        
        sc.close();
    }
}
