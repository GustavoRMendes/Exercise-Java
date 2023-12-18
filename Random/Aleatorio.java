package Random;
import java.util.Random;
public class Aleatorio {
    public static void main(String[] args) throws Exception{
        
        Random gerador = new Random();
        int numero = gerador.nextInt(100) + 1;
        System.out.println(numero);

        // Or (Math.random() * 100) + 1;

    }

}
