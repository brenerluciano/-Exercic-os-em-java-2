import java.util.Scanner;

public class Exercicío5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de revestimento!");
        System.out.print("Informe a largura da área (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Informe o comprimento da área (em metros): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Informe o tamanho da cerâmica (em metros quadrados EX: 0.2 para 20x20cm): ");
        double tamanhoCeramica = scanner.nextDouble();

        // Calcula a área total a ser revestida
        double areaTotal = largura * comprimento;

        // Considera 10% de folga para o acabamento
        double areaComFolga = areaTotal * 1.1;

        // Calcula a quantidade de cerâmica necessária
        double quantidadeCeramica = Math.ceil(areaComFolga / tamanhoCeramica);

        double valordaceramica = (tamanhoCeramica * 35) * quantidadeCeramica;

        System.out.println("\nQuantidade de cerâmica necessária: " + quantidadeCeramica + " peças.");
        System.out.println("\nO valor total da cerãmica por m² será de: R$" + valordaceramica);

        scanner.close();
    }
}