import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        
        String nome = scanner.nextLine();

        System.out.printf("O seu nome é: " + nome);
        scanner.close();
    
    }
    
}
