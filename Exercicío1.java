import java.util.Scanner;

public class Exercicío1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
       
       double horas;
       double minutos;
       double tempototal;
       double tempofinal;
       
       
        System.out.print("Insira as horas: ");
        
        horas = scanner.nextDouble();

        System.out.print("Insira os minutos: ");
        
        minutos = scanner.nextDouble();

        tempototal = horas * 60;

        tempofinal  = tempototal + minutos;

        System.out.println(" No total serão : " + tempofinal + " minutos.");

        scanner.close();
    }
}
