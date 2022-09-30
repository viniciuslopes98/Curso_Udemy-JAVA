package PrimeiroModulo.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Olá! Bem-vindo a nossa calculadora.");
        
        System.out.println("\nDigite o primeiro número: ");
        double num1 = leia.nextDouble();
        
        System.out.println("\nAgora escolha um operador para realizar o cáculo. "+
        "Dentre eles: + (para adição) , - (para subtração) , *(multiplicação) , / (para divisão) e % para obter resto de divisão. ");
        String op = leia.next();
        
        System.out.println("\nDigite o segundo número: ");
        double num2 = leia.nextDouble();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;
        
        System.out.printf("Para: %.0f %s %.0f o resultado é %.0f: ",num1,op,num2,resultado);

        leia.close();




    }
}
