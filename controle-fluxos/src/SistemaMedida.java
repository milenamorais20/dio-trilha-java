import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        String tamanho;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite P, M ou G");
        tamanho = sc.nextLine();

        switch (tamanho) {
            case "P":
            System.out.println("PEQUENO");
                break;
            case "M":
            System.out.println("MÉDIO");
                break;
            case "G":
            System.out.println("MÉDIO");
                break;
            default:
            System.out.println("Digite uma sigla válida");
                break;
        }
        sc.close();
    }
}
