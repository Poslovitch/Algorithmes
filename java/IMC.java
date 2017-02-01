package java;

import java.util.Scanner;

public class IMC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calcul de l'IMC:");
        System.out.println("");
        System.out.println("Poids (en kg)?");
        double poids = sc.nextDouble();
        System.out.println("Taille (en cm)?");
        double taille = sc.nextDouble();
        System.out.println("");
        
        double imc = poids / (taille * taille);
        
        System.out.println("IMC: " + imc);
        if(imc < 20) System.out.println("Maigreur");
        else if(imc > 25) System.out.println("Surcharge pondérale");
        else System.out.println("Poids normal");
        
        sc.close();
    }
}
