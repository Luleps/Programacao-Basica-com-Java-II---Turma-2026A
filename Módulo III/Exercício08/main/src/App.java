import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int senha;
        do {
            System.out.println("Digite a senha: ");
            senha = reader.nextInt();
        } while (senha != 1234);
        System.out.println("Senha correta, acesso liberado");       
        reader.close();
    }
}
