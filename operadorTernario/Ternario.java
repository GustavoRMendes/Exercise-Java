package operadorTernario;

import javax.swing.JOptionPane;

public class Ternario {
    public static void main(String[] args)throws Exception {

        /* Operador Ternário = "True" : "False" ? */

        int numero = 10;
        String resultado = (numero == 10) ? "Número é 10" : "Número não é 10";
        
        JOptionPane.showMessageDialog(null,"resultado: " + resultado,"Número é igual a 10?",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
