package SegundoModulo.EstruturaDeControle;

import javax.swing.JOptionPane;

public class IfElse {
public static void main(String[] args) {
    
        
        String valor = JOptionPane.showInputDialog("informe o valor");
        
        int numero = Integer.parseInt(valor);
        
        if (numero % 2 == 0) {
            System.out.println("Este número é par!");
            
        } else {
            
            System.out.println("Este número é impar!");
        }
    }
    
}