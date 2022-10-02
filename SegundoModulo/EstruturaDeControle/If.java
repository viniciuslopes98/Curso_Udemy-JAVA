package SegundoModulo.EstruturaDeControle;

import java.util.Scanner;

public class If {
    

        public static void main(String[] args) {
    
            Scanner leia = new Scanner(System.in);
    
            System.out.println("Informe a média");
            double media = leia.nextDouble();
    
            if (media <= 10 && media >= 7.0) {
                System.out.println("Aprovado!");
                System.out.println("Parabéns!");
            }
    
            if (media < 7 && media >= 4.5) {
                System.out.println("Recuperação");
    
            }
            
            // Se for uma sentença repetitiva, adicionar resultado à uma variável pode facilitar:
            boolean criterioAprovacaoAtingido = media < 4.5 && media >= 0;
            
            if (criterioAprovacaoAtingido) {
                System.out.println("Reprovado");
                
                leia.close();
            }
    
    }
}