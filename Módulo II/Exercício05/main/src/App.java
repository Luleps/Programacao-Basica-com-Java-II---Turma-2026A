import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite a de viagens: ");
        int qtdViagens = reader.nextInt();
        int viagensLidas = 0;
        int litros = 0;
        int distancia = 0;
        while (viagensLidas < qtdViagens) {
            System.out.println("Digite a quantidade de litros: ");
            int qtdLitros = reader.nextInt();
            litros = litros + qtdLitros;
            System.out.println("Digite a quilometragem rodada: ");
            int km = reader.nextInt();
            distancia = distancia + km;
            viagensLidas = viagensLidas + 1;
        }
        double media = (double) distancia / litros;
        System.out.println("O consumo medio do carro e: " + media);
        reader.close();
    }
}
