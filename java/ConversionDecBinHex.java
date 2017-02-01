package java;

import java.util.Scanner;

public class ConversionDecBinHex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char continuer, mode;
        
        do{
            continuer = ' ';
            mode = ' ';
            
            // Mode
            do{
                System.out.println("Choix du mode de conversion:");
                System.out.println("1: Décimal -> Binaire & Héxadécimal");
                System.out.println("2: Binaire -> Décimal & Héxadécimal");
                System.out.println("3: Hexadécimal -> Décimal & Binaire");
                
                mode = sc.nextLine().charAt(0);
                if(mode != '1' && mode != '2' && mode != '3') System.out.println("Choix inconnu, veuillez réitérer.");
            } while(mode != '1' && mode != '2' && mode != '3');
        
            String dec, bin, hex;
            
        } while(continuer == 'O');
        
        sc.close();
    }
}
