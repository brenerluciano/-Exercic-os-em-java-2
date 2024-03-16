import java.util.Scanner;

public class Exercicío3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       double a;
       double b; 
       double c;
       double valorfinal;

       System.out.print(" Qual o valor de a: ");
        a = scanner.nextDouble();

       System.out.printf("\n Qual o valor de b: ");
       b = scanner.nextDouble();

       System.out.printf("\n Qual o valor de c: ");
       c = scanner.nextDouble();

       valorfinal = (a * c) / b;

       System.out.printf("\n O resultado final será: " + valorfinal);

       scanner.close();
    
    }
}