import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o numero de mercadorias comercializadas: ");
        int n = reader.nextInt();
        reader.nextLine();
        double faturamentoTotal = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o nome da mercadoria " + i + ": ");
            String nome = reader.nextLine();
            System.out.println("Digite o preço unitario da mercadoria " + i + ": ");
            double preco = reader.nextDouble();
            System.out.println("Digite a quantidade vendida da mercadoria " + i + ": ");
            int quantidade = reader.nextInt();
            double faturamentoMercadoria = preco * quantidade;
            faturamentoTotal = faturamentoTotal * faturamentoMercadoria;
        }
        System.out.println("O faturamento total mensal do armazem e: " + faturamentoTotal);
        reader.close();
    }
}