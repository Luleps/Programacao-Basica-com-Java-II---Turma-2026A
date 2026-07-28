import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);           
        System.out.println("Digite os numeros da placa: ");
        int numerosPlaca = reader.nextInt();
        int ultimoDigito = numerosPlaca % 10;
        String mesVistoria;
        switch (ultimoDigito) {
            case 0: mesVistoria = "Realizar vistoria em janeiro do proximo ano"; break;
            case 1: mesVistoria = "Realizar vistoria em fevereiro do proximo ano"; break;    
            case 2: mesVistoria = "Realizar vistoria em março do proximo ano"; break;   
            case 3: mesVistoria = "Realizar vistoria em abril do proximo ano"; break;
            case 4: mesVistoria = "Realizar vistoria em maio do proximo ano"; break;
            case 5: mesVistoria = "Realizar vistoria em junho do proximo ano"; break;
            case 6: mesVistoria = "Realizar vistoria em setembro deste ano"; break;
            case 7: mesVistoria = "Realizar vistoria em outubro deste ano"; break;
            case 8: mesVistoria = "Realizar vistoria em novembro deste ano"; break;
            case 9: mesVistoria = "Realizar vistoria em dezembro deste ano"; break;
            default: mesVistoria = null; break;                
        }
        System.out.println(mesVistoria);
        reader.close();
    }
}
