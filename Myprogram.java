public class Myprogram {
    public static void main(String[] args) {
        int nota = 80;
        int media = 70;
        int faltas = 10;
        int maxFaltas = 5;
        String resultado;
        resultado = nota > media ? "APROVADO" : "REPROVADO"; //Operação Ternária
        System.out.printf("%s",resultado);
        
        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.printf("\nAprovado");
        }else if(nota >= 40){
            System.out.printf("\nRecuperacao");
        }else{
            System.out.printf("\nReprovado");
        }
        System.out.printf("\nFIM DO PROGRAMA");   
    }
}
