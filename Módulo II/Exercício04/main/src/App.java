import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite a idade: ");
        int idade = reader.nextInt();
        int soma = 0;
        double media;
        int idadesLidas = 0;
        while (idade > 0) {
            soma = soma + idade;
            idadesLidas = idadesLidas + 1;
            System.out.println("Digite a idade: ");
            idade = reader.nextInt();
        }
        media = (double) soma / idadesLidas;
        System.out.println("A media das idades digitadas e: " + media);
        reader.close();
    }
}
