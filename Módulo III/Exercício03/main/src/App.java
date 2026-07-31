import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o número " + i + ": ");
            int numeros = reader.nextInt();
            soma = soma + numeros;
        }
        System.out.println("A soma dos 10 numeros e: " + soma);
        reader.close();
    }
}