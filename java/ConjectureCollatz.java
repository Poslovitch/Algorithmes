import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int start = -1;
    do{
      System.out.println("Choose a start number (positive integer)");
      start = sc.nextInt();
    } while(start < 0);
    sc.close();
    
    int calc = start;
    int time = 0;
    
    System.out.print(start);
    while(calc != 1){
      if(calc % 2 == 0) calc /= 2;
      else calc = 3*calc + 1;
      time++;
      System.out.print(calc);
    }
    System.out.println("");
    
    System.out.println("Found 1 as result by " + time + " calculations.");
  }
}
