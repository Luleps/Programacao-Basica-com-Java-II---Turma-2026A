import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = reader.nextDouble();
        System.out.println("Digite o número de horas trabalhadas: ");
        double numHora = reader.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        double numDependentes = reader.nextDouble();
        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        double qtdHoraExtra = reader.nextDouble();
        double salMes = numHora * valorHora;
        double salFamilia = numDependentes * 132;
        double valorHoraExtra = (valorHora * 50) / 100;
        double acrescimoHorasExtras = valorHoraExtra * qtdHoraExtra;
        double salBruto = salMes + salFamilia + valorHoraExtra;
        if (res >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        reader.close();
    }
}
