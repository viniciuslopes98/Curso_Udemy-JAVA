package SegundoModulo.EstruturaDeControle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        String conceito = "";
        int nota;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua nota para saber o conceito dela:");
        nota = leia.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
                conceito = "E";
                break;

            default:
                conceito = "não informado";
        }
        System.out.println("O conceito de sua nota é:" + conceito);
        leia.close();
    }

}
