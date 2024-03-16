import java.util.Scanner;

public class Exercicío7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        float pesoKg = scanner.nextFloat();

        System.out.print("Digite sua altura (em centímetros): ");
        float alturaCm = scanner.nextFloat();

        // Convertendo a altura para metros
        float alturaMetros = alturaCm / 100;

        // Calculando o IMC
        float imc = pesoKg / (alturaMetros * alturaMetros);

        System.out.println("Seu IMC é: " + imc);

        // Peso ideal ajustado
        float pesoIdealMin = 18.5f * (alturaMetros * alturaMetros);
        float pesoIdealMax = 24.9f * (alturaMetros * alturaMetros);

        System.out.println("Peso ideal ajustado: Entre " + pesoIdealMin + " kg e " + pesoIdealMax + " kg");

        scanner.close();
    }
}