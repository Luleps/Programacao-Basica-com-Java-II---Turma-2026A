import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = reader.nextInt();
        int somatorio = 0;
        int somaQuadrado = 0;

        for (int i = 1; i <= n; i++) {
            somatorio = somatorio + i;
            somaQuadrado = somaQuadrado + (i *i);
        }
        int media = somatorio / n;
        System.out.println("A soma dos " + n + " primeiros numeros: " + somatorio);
        System.out.println("A soma dos quadrados dos " + n + " primeiros numeros: " + somaQuadrado);
        System.out.println("A media dos " + n + " primeiros numeros: " + media);
        reader.close();
    }
}