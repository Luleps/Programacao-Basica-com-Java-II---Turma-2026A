import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite um numero positivo: ");
        int numero = reader.nextInt();
        while (numero >= 0) {
            int quadrado = numero * numero;
            System.out.println("O quadrado do numero digitado e: " + quadrado);
            System.out.println("Digite outro numero ou digite um numero negativo para encerrar");
            numero = reader.nextInt();
        }
        System.out.println("O numero negativo. Programa encerrado");
        reader.close();
    }
}
