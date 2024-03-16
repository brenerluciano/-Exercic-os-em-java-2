import java.util.Scanner; 
 
public class Exercicío6 { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Informe o tamanho do arquivo em megabytes (MB): "); 
        double tamanhoArquivoMB = scanner.nextDouble(); 
 
        System.out.print("Informe a velocidade do link em megabits por segundo (Mbps): "); 
        double velocidadeMbps = scanner.nextDouble(); 
 
        // Converter tamanho do arquivo para megabits 
        double tamanhoArquivoMb = tamanhoArquivoMB * 8; 
 
        // Calcular o tempo de download em segundos 
        double tempoSegundos = tamanhoArquivoMb / velocidadeMbps; 
 
        // Converter para minutos 
        int minutos = (int) (tempoSegundos / 60); 
        int segundos = (int) (tempoSegundos % 60); 
 
        System.out.println("Tempo estimado de download: " + minutos + " minutos e " + segundos + " segundos."); 
        scanner.close();
    } 
} 