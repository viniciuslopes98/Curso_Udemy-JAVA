package SegundoModulo.EstruturaDeControle;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Para sair basta digitar 'sair'. Digite qualquer coisa: ");
            valor = leia.nextLine();
        }
        System.out.println("\nAté mais!!\n");
        leia.close();
    }
}
