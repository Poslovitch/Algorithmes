package java.cryptage;

import java.util.Scanner;

public class Cryptage3D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le message à (dé)crypter:");
        String msg = sc.nextLine();
        
        System.out.println("Entrez le nombre de points:");
        int nbPoints = sc.nextInt();
        
        List<PointLocation> points = new ArrayList<PointLocation>();
        for(int point = 1 ; point <= nbPoints ; point++){
            System.out.println("X(" + point + "):");
            double x = sc.nextDouble();
            System.out.println("Y(" + point + "):");
            double y = sc.nextDouble();
            System.out.println("Z(" + point + "):");
            double z = sc.nextDouble();
            points.add(new PointLocation(new double[]{x, y, z}));
        }
        
        sc.close();
    }
}
