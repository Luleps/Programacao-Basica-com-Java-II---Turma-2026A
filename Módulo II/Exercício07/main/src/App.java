import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        int numeroInicial = 15;
        int numeroFinal = 200;
        while (numeroInicial <= numeroFinal) {
            int quadrado = numeroInicial * numeroInicial;
            System.out.println("O quadrado de " + numeroInicial + " e: " + quadrado);
            numeroInicial = numeroInicial + 1;
        }
        reader.close();
    }
}