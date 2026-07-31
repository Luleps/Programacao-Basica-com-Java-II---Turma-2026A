import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int contador = 1;
        System.out.println(a);
        System.out.println(b);
        do {
            int proximo = a + b;
            System.out.println(proximo);
            a = b;
            b = proximo;
            contador = contador + 1;
        } while (contador < 8);       
        reader.close();
    }
}
