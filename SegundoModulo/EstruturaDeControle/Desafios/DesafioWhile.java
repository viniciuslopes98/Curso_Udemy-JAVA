package SegundoModulo.EstruturaDeControle.Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // Desafio: Pedir para o usuario entrar com um valor indeterminado de notas e ao final calcular
        // a média das mesmas. O usuário deve digitar -1 quando terminar de digitar as notas.
        
        Scanner leia = new Scanner(System.in);

        int quantidadeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Digite suas notas a seguir! Quando terminar digite -1 para sair.");
            nota = leia.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeNotas++;
            } else if (nota != -1) {
                System.out.println("Digite uma nota válida!!");
            }

        }

        double media = total / quantidadeNotas;
        System.out.println("\nA sua média é: " + media);

        leia.close();
    }
}
