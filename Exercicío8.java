import java.util.Scanner;

public class Exercicío8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double peso;
        double quantidadedeaugua;
        double litrospordia;

        System.out.printf("\n Qual o seu peso atual: ");
        peso = scanner.nextDouble();

        quantidadedeaugua = 0.035 * peso; 

        litrospordia = Math.round(quantidadedeaugua * 100.0) / 100.0;

        System.out.printf("\n Você terá que beber " + litrospordia + " litros de água por dia.");

        scanner.close();

    }
    
}