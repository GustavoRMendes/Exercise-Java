package DevJava;

import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args)throws Exception {
        String filme = JOptionPane.showInputDialog(null,"Digite seu filme favorito: ","Qual seu filme favorito? ",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"filme: " + filme,"Filme Favorito",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(filme);
    }
}
