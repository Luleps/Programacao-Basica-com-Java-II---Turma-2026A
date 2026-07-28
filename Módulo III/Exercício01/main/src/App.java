//Faça um programa que calcule a soma de dez números quaisquer fornecidos pelo usuário

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite o dia: ");
        int dia = reader.nextInt();
        System.out.println("Digite o mês: ");
        int mes = reader.nextInt();
        System.out.println("Digite o ano: ");
        int ano = reader.nextInt();
        String  nomeMes;
        switch (mes) {
            case 1: nomeMes = "janeiro";
                
                break;
            case 2: nomeMes = "Fevereiro";
                
                break;
            case 3: nomeMes = "Março";
                
                break;
            case 4: nomeMes = "Abril";
                
                break;
            case 5: nomeMes = "Maio";
                
                break;
            case 6: nomeMes = "Junho";
                
                break;
            case 7: nomeMes = "Julho";
                
                break;
            case 8: nomeMes = "Agosto";
                
                break;
            case 9: nomeMes = "Setembro";
                
                break;
            case 10: nomeMes = "Outubro";
                
                break;
            case 11: nomeMes = "Novembro";
                
                break;
            case 12: nomeMes = "Dezembro";
                
                break;
            default: nomeMes = null;
                break;
        }
        if (nomeMes == null) {
            System.out.println("Mês inválido");
        } else {
            System.out.println(dia + " de " + nomeMes + " de " + ano);
        }
        reader.close();
    }
}
