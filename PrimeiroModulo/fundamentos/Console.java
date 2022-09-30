package PrimeiroModulo.fundamentos;

import java.util.Scanner;

public class Console {
 
    public static void main(String[] args) {
        // System.out.print("Bom");
        // System.out.print(" dia");
        // System.out.println("Bom");
        // System.out.println("Bom");
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual é a sua idade ? ");
        var idade = leia.nextDouble();
        System.out.println("Qual é a sua altura ? ");
        var altura = leia.nextDouble();

        System.out.printf("Voce tem %.0f anos de idade e %.0f de altura! Seja-Bem-vinde!!",idade,altura);
        
        leia.close();

        
    }
}
