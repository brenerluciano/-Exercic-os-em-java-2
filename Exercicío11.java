import java.util.Scanner;

public class Exercicío11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos pontos P1 e P2
        System.out.print("Digite o valor de x1 (P1): ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite o valor de y1 (P1): ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite o valor de x2 (P2): ");
        double x2 = scanner.nextDouble();
        System.out.print("Digite o valor de y2 (P2): ");
        double y2 = scanner.nextDouble();

        // Calcula a distância entre os pontos
        double distancia = calcularDistancia(x1, y1, x2, y2);

        double distanciafinal = Math.round(distancia * 100.0) / 100.0;

        // Exibe o resultado
        System.out.println("A distância entre os pontos P1 e P2 é: " + distanciafinal);

        scanner.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double difX = x2 - x1;
        double difY = y2 - y1;
        return Math.sqrt(difX * difX + difY * difY);
    }
}