import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        char continuer = ' ', mode = ' ';
        
        do{
            continuer = ' ';
            
            //Mode
            do{
                System.out.println("Choisir le mode de conversion:");
                System.out.println("1: Celsius -> Fahrenheit");
                System.out.println("2: Fahrenheit -> Celsius");
                mode = scan.nextLine().charAt(0);
                
                if(mode != '1' && mode != '2') System.out.println("Choix inconnu. Veuillez réitérer.")
            } while(mode != '1' && mode != '2');
            
            // Valeur à calculer
            double from = 0.0, to = 0.0;
            System.out.println("Température à convertir:");
            from = scan.nextDouble();
            
            // Calcul
            if(mode == '1'){
                to = 1.8*from + 32;
                System.println(from + "°C correspondent à " + to + "°F");
            } else {
                to = ((from - 32) * 5) / 9;
                System.println(from + "°F correspondent à " + to + "°C");
            }
            
            //Continuer ou arrêter
            do{
                System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
                continuer = scan.nextLine().charAt(0);
                if(continuer != 'O' && continuer != 'N') System.out.println("Choix inconnu. Veuillez réitérer.")
            } while(continuer != 'O' && continuer != 'N');
        } while(continuer == 'O');
        
        scan.close();
    }
}
