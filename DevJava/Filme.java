package DevJava;
import java.util.Scanner;
class Filme {
    public static void main(String[] args) throws Exception{
      String filme;  
      try (Scanner leitor = new Scanner(System.in)){
        System.out.println("Digite seu filme: "); 
        filme = leitor.nextLine();
        System.out.printf("Seu filme é: %s",filme);
      };
    }
}