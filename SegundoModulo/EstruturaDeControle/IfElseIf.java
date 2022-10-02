package SegundoModulo.EstruturaDeControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("digite a nota: ");
        double nota = leia.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida! Digite outro valor.");
        } else if (nota >= 8.1) {
            System.out.println("Nota de conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Nota de conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Nota de conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Nota de conceito D");
        }

        System.out.println("Obrigado!");
        leia.close();
    }

}
