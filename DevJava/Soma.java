package DevJava;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args)throws Exception {
        int x;
        int y;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o valor de x: ");
            x = leitor.nextInt();
            System.out.println("Digite o valor de y: ");
            y = leitor.nextInt();
        }
        int soma = x + y;
        System.out.printf("A soma entre %d + %d = %d",x,y,soma);
    }    
}
