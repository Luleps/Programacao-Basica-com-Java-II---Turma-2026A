import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite o limite superior do somatório: ");
        int limSuperior = reader.nextInt();
        int limInferior = 1;
        int somatorio = 0;
        int somaQuadrados = 0;
        while (limInferior <= limSuperior) {
            somatorio = somatorio + limInferior;
            somaQuadrados = somaQuadrados + (limInferior * limInferior);
            limInferior = limInferior + 1;            
        }
        double media = somatorio / limSuperior;
        System.out.println("somatório: " + somatorio);
        System.out.println("soma dos quadrados: " + somaQuadrados);
        System.out.println("media: " + media);
        reader.close();
    }
}
