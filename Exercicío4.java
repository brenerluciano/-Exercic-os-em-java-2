import java.util.Scanner;

public class Exercicío4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double area;
        double perimetro;
        double diagonal;

        System.out.println("Bem-vindo à Calculadora de Retângulo!");
        System.out.println("Informe a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();

        
        area = largura * altura;
        perimetro = 2 * (largura + altura);
        diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

        
        System.out.println("\nResultados:");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.printf("Diagonal: " + diagonal);

        scanner.close();
    }
}