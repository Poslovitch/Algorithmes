package java.cryptage;

import java.util.Scanner;

public class Cryptage3D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le message à (dé)crypter:");
        String msg = sc.nextLine();
        
        System.out.println("Entrez le nombre de points:");
        int nbPoints = sc.nextInt();
        
        for(int point = 1 ; point <= nbPoints ; point++){
            System.out.println("X(" + point + "):");
            
            System.out.println("Y(" + point + "):");
            
            System.out.println("Z(" + point + "):");
        }
        
        sc.close();
    }
}
