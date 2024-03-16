import java.util.Scanner;

public class Exercicío2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Qual será o valor de a: ");
        
        a = scanner.nextDouble();
        
        System.out.printf("\nQual será o valor de b: ");
        
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
         
        System.out.print("\nA hipotenusa é: " + c);
         
        scanner.close();


    }
    }