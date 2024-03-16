import java.util.Scanner;

public class Exercicío9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a potência do equipamento (em Watts): ");
        double potenciaWatts = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Informe o valor do kWh (em reais): ");
        double valorKWh = scanner.nextDouble();

        // Calculando o consumo de energia em kWh
        double consumoKWh = (potenciaWatts * horasPorDia) / 1000.0;

        // Calculando o valor pago pelo consumo
        double valorPago = consumoKWh * valorKWh;

        double valorpormes =  valorPago * 30;

        System.out.println("Consumo de energia: " + consumoKWh + " kWh por dia");
        System.out.println("Valor pago: R$" + valorPago);
        System.err.printf("\n\n Esse valor por mês será de: R$" + valorpormes);

        scanner.close();
    }
}