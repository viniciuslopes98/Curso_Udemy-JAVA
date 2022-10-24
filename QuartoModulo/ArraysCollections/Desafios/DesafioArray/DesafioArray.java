package QuartoModulo.ArraysCollections.Desafios.DesafioArray;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas notas você deseja calcular ? O máximo de notas é 5.");
        int valor = leia.nextInt();

        if (valor <= 5 && valor != 0) {

            double[] notas = new double[valor];

            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota " + (i + 1) + ": ");
                notas[i] = leia.nextDouble();
            }

            double total = 0;
            for (double nota : notas) {
                total += nota;
            }

            double media = total / notas.length;
            System.out.println("A média é " + media + "!!");

        } else
            System.out.println("Digite uma quantidade de nota válida! 1 até 5.");

        leia.close();
    }

}
