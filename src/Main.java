
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("your weight;");
        int weight = scanner.nextInt();
        
        System.out.println("Height: (Example: 1,75)");
        double height = scanner.nextDouble();
        
        double bki = (weight / (height * height));
        
        if (bki < 18.5 ) {
            System.out.println("Weak");     
    }
        
        else if (bki >= 18.5 && bki < 25 ) {
            System.out.println("Normal");
        }
        
        else if (bki >= 25 && bki < 30) {
            
            System.out.println("Overweight");
        }
        
        else  {
        
            System.out.println("Obese");
        }
               
        
  
                
    }   
}
