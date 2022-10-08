package SegundoModulo.EstruturaDeControle;

public class Breakrotulado {
    public static void main(String[] args) {
            
        //Não muito utilizado
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; j++) {
                if (i == 1) {
                    break externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();

        }
        System.out.println("Fim");
    }

}