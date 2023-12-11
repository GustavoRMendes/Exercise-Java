package array;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
      
        // Exercício Respostas do Gabarito
        
        final int tamanho = 5;
        char [] gabarito = {'a','a','d','b','c'};
        char [] respostas = new char[tamanho];
        int nota = 0;
        Scanner scan = new Scanner(System.in);
        
        respostas[0] = 'a';
        respostas[1] = 'a';
        respostas[2] = 'c';
        respostas[3] = 'b';
        respostas[4] = 'c';
        
        for (int i = 0; i < tamanho; i++){
            System.out.printf(" Informe a resposta %d: ",i);
            respostas[i] = scan.nextLine().charAt(0);
        }
        for (int i = 0; i < tamanho; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }
        System.out.printf("\n Nota: %d", nota);
    }
}
