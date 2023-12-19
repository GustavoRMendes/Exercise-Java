package array;

import java.util.Arrays;

//import java.util.Arrays;
public class Methods {
    public static void main(String[] args) {
    /*  - Arrays.sort ⇒ Ordena o array
        - Arrays.fill ⇒ Preenche arrays com um valor específico
        - Arrays.equal ⇒ Compara dois arrays
        - Arrays.binarySearch ⇒ Verifica se existe um determinado elemento dentro do array
        - BinarySearch só funciona com array ORDENADO
        - System.arraycopy => Copia outro array  
    */
    int [] numeros = new int [50];
    Arrays.fill(numeros,10);
    System.out.print(Arrays.toString(numeros));
}
}