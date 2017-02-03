package java;

import java.util.Scanner;

public class TableauNombresOpposes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Taille du tableau:");
        int size = sc.nextInt();
        
        System.out.println("Contenu du tableau:");
        String[] contenu = sc.nextLine().split(" ");
        
        int[] tableau = new int[size];
        for(int index = 1 ; index <= contenu.length ; index++){
            tableau[index-1] = Integer.valueOf(contenu[index-1]);
        }
        
        
        
        sc.close();
    }
}
