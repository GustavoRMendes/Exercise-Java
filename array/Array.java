package array;
// import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
    
        // Vetores em Java     
        int [] num = new int[5];
        int [] numeros = {10,20,30,40,50};

        num[0] = 5;
        num[1] = 10;
        num[2] = 15;
        num[3] = 20;
        num[4] = 25;

        for (int cont = 0; cont < num.length; cont++){
            System.out.printf("\n Array num: %d ", num[cont]);
        }

        System.out.printf("\n %d",num[0]);
        System.out.printf("\n %d",numeros[0]);
        
    }
}
