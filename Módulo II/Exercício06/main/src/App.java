import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite a quantidade de mercadorias vendidas: ");
        int qtdMercadoria = reader.nextInt();
        reader.nextLine();
        int qtdMercadoriaInformada = 0;
        double faturamentoTotal = 0;
        while (qtdMercadoriaInformada < qtdMercadoria) {
            System.out.println("Digite o nome da mercadoria: ");
            String nomeMercadoria = reader.nextLine();
            System.out.println("Digite o preço unitario: ");
            double precoUnitario = reader.nextDouble();
            System.out.println("Digite a quantidade de vendas: ");
            int qtdVendas = reader.nextInt();
            faturamentoTotal = (precoUnitario * qtdVendas) + faturamentoTotal;
            qtdMercadoriaInformada = qtdMercadoriaInformada + 1;
        }
        System.out.println("O faturamento total e: " + faturamentoTotal);
        reader.close();
    }
}
