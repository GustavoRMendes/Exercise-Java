package array;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args) {
        int [] num = {9,2,7,1,8,5,3,4,0,6};
        int [] numeros = {10,20,30,40,50,60,70};
        String [] nomes = new String[5];

        nomes[0] = "Gustavo";
        nomes[1] = "Elisangela";
        nomes[2] = "Gaby";
        nomes[3] = "Geo";
        nomes[4] = "Felipe";
        
        Arrays.sort(num); // Método Ordenar
        
        System.out.print(Arrays.equals(num,numeros)); // Método Comparar
        
        for (String cont : nomes) {
            System.out.printf("\n %s ",cont);           
        }
        
        for (int i : num) {
            System.out.printf(" \n%d",i);
        }
        
        System.out.printf(" \nFim do Programa!!!");
    }   
}
