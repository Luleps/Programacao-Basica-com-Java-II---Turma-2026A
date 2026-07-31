import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        for (int i = 15; i <= 200; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " e: " + quadrado);
        }        
        reader.close();
    }
}