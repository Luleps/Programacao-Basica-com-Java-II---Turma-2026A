import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o numero de viagens realizadas: ");
        int n = reader.nextInt();
        int somaConsumo = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a quantidade de litros da viagem " + i + ": ");
            int litros = reader.nextInt();
            System.out.println("Digite a distancia percorrida na viagem " + i + ": ");
            int distancia = reader.nextInt();
            int consumo = distancia / litros;
            somaConsumo = somaConsumo + consumo;
        }
        int consumoMedio = somaConsumo / n;
        System.out.println("O consumo medio do carro e: " + consumoMedio + " km/l");
        reader.close();
    }
}