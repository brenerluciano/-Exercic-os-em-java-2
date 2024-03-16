import java.util.Scanner;

public class Exercicío10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da primeira fração
        System.out.print("Digite o numerador da primeira fração: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Digite o denominador da primeira fração: ");
        int denominador1 = scanner.nextInt();

        // Entrada da segunda fração
        System.out.print("Digite o numerador da segunda fração: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Digite o denominador da segunda fração: ");
        int denominador2 = scanner.nextInt();

        // Calcula a soma das frações
        int novoNumerador = numerador1 * denominador2 + numerador2 * denominador1;
        int novoDenominador = denominador1 * denominador2;

        // Exibe o resultado
        System.out.println("A soma das frações é: " + novoNumerador + "/" + novoDenominador);

        scanner.close();
    }
}