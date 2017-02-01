import java.util.Scanner;

public class Sphere{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char continuer = ' ', mode = ' ';
        String unit = " ";
        String[] units = {"mm", "cm", "dm", "m", "dam", "hm", "km"};
        
        do{
            continuer = ' ';
            unit = " ";
            
            //Mode
            do{
                System.out.println("Indiquer la donnée qui sera entrée:");
                System.out.println("1: Rayon du cercle");
                System.out.println("2: Périmètre du cercle");
                System.out.println("3: Périmètre du cercle");
                System.out.println("4: Aire du disque");
                System.out.println("5: Aire de la sphère");
                System.out.println("6: Volume de la boule");
                
                mode = sc.nextLine().charAt(0);
                
                if(mode != '1' && mode != '2' && mode != '3' && mode != '4' && mode != '5' && mode != '6')
                    System.out.println("Choix incorrect, veuillez réessayer.");
            } while(mode != '1' && mode != '2' && mode != '3' && mode != '4' && mode != '5' && mode != '6');
            
            //Unité
            do{
                System.out.println("Indiquer l'unité de calcul:");
                System.out.println("1: mm");
                System.out.println("2: cm");
                System.out.println("3: dm");
                System.out.println("4: m");
                System.out.println("5: dam");
                System.out.println("6: hm");
                System.out.println("7: km");
                
                try{
                    unit = units[sc.nextInt()-1];
                } catch(Exception e){
                    System.out.println("Choix incorrect, veuillez réessayer.");
                }
            } while(unit == " ");
            
            //Assignation de la donnée entrée & calculs
            double rayon = 0.0, diam = 0.0; perim = 0.0, aireD = 0.0 ; aireS = 0.0 ; vol = 0.0;
            
            double entry = -1;
            do{
                entry = sc.nextDouble();
                if(entry <= 0) System.out.println("Donnée incorrecte : doit être > à 0.");
            } while(entry <= 0);
            
            if(mode == '1'){
                rayon = entry;
                diam = rayon*2.0;
                perim = Math.PI * diam;
                aireD = Math.PI * (rayon * rayon);
                aireS = 4 * Math.PI * (rayon * rayon);
                vol = (4 * Math.PI * (rayon * rayon * rayon)) / 3;
            }
            else if(mode == '2'){
                diam = entry;
                rayon = diam / 2.0;
                perim = Math.PI * diam;
                aireD = Math.PI * (rayon * rayon);
                aireS = 4 * Math.PI * (rayon * rayon);
                vol = (4 * Math.PI * (rayon * rayon * rayon)) / 3;
            }
            else if(mode == '3'){
                perim = entry;
                diam = perim / Math.PI;
                rayon = diam / 2.0;
                aireD = Math.PI * (rayon * rayon);
                aireS = 4 * Math.PI * (rayon * rayon);
                vol = (4 * Math.PI * (rayon * rayon * rayon)) / 3;
            }
            else if(mode == '4'){
                aireD = entry;
                rayon = Math.sqrt(aireD / Math.PI);
                diam = rayon * 2.0;
                perim = Math.PI * diam;
                aireS = 4 * Math.PI * (rayon * rayon);
                vol = (4 * Math.PI * (rayon * rayon * rayon)) / 3;
            }
            else if(mode == '5'){
                aireS = entry;
                rayon = Math.sqrt(aireS / 4 / Math.PI);
                diam = rayon * 2.0;
                perim = Math.PI * diam;
                aireD = Math.PI * (rayon * rayon);
                vol = (4 * Math.PI * (rayon * rayon * rayon)) / 3;
            }
            else if(mode == '6'){
                vol = entry;
                rayon = Math.sqrt3(vol * 3 / 4 / Math.PI);
                diam = rayon * 2.0;
                perim = Math.PI * diam;
                aireD = Math.PI * (rayon * rayon);
                aireS = 4 * Math.PI * (rayon * rayon);
            }
            
            //Sortie
            System.out.println("=====================");
            System.out.println("Rayon du cercle = " + rayon + " " + unit);
            System.out.println("Diamètre du cercle = " + diam + " " + unit);
            System.out.println("Périmètre du cercle = " + perim + " " + unit);
            System.out.println("Aire du disque = " + aireD + " " + unit);
            System.out.println("Aire de la sphère = " + aireS + " " + unit);
            System.out.println("Volume de la boule = " + vol + " " + unit);
            System.out.println("=====================");
            
            //Continuer
            do{
                System.out.println("Souhaitez-vous rentrer une autre valeur? (O/N)");
                continuer = sc.nextLine().charAt(0);
                if(continuer != 'O' && continuer != 'N') System.out.println("Choix incorrect, veuillez réessayer.");
            } while(continuer != 'O' && continuer != 'N');
            
        } while(continue == 'O');
        
        sc.close();
    }
}
