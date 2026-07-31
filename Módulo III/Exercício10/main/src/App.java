import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Menu de Opções:");
        System.out.println("1. Somar dois numeros.");
        System.out.println("2. Numero ao quadrado.");
        System.out.println("Digite a opção desejada: ");
        int opcao = reader.nextInt();
        switch (opcao) {
            case 1: System.out.println("Digite o primeiro numero"); 
            int num1 = reader.nextInt(); 
            System.out.println("Digite o segundo numero");
            int num2 = reader.nextInt(); 
            int resultado = num1 + num2;
            System.out.println("A soma é: " + resultado); break;
            case 2: System.out.println("Digite um numero"); 
            int num = reader.nextInt(); 
            int resultado1 = num * num;
            System.out.println("O quadrado é: " + resultado1); break; 
            default: System.out.println("Opção inválida"); break;                
        }
        reader.close();
    }
}
