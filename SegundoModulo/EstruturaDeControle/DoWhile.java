package SegundoModulo.EstruturaDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double numero;
        
        do {
           System.out.println("Digite um numero para acrescentar a soma! Digite -1 para sair");
           numero = leia.nextDouble(); 
            numero += numero;
        }while(numero != -1);
        
        System.out.println("Até mais!!");


    }
}
    