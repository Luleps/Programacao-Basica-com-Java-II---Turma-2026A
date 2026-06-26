//Faça um programa que calcule a soma de dez números quaisquer fornecidos pelo usuário

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite o número: ");
        double numeros = reader.nextDouble();
        double soma = 0;
        double numerosLidos = 0;
        while (numerosLidos <=10) {
            soma = soma + numeros;
            numerosLidos = numerosLidos + 1;
        }
        System.out.println("A soma dos 10 numeros e: " + soma);
        reader.close();
    }
}
