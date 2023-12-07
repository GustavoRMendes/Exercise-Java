import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";
        int n1 = 0;
        int n2 = 0;
        int resultado = 0;
        System.out.printf("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.printf("Digite um numeral: ");
        n1 = scan.nextInt();
        System.out.printf("Digite outro numeral: ");
        n2 = scan.nextInt();
        resultado = n1 + n2;
        final int media = (n1+n2) / 2;
        System.out.printf("%s, sua soma e: %d, e sua media foi:  %d", nome,resultado,media);   
    }
}
