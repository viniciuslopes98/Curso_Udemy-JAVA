package SegundoModulo.EstruturaDeControle.Desafios;

import java.util.Scanner;

public class DesafioElseIf {
    // Fazer com que os dias da semana digitados pelo usuário retorne um número,
    // exemplo:
    // Domingo ==> 1
    // Quarta ==> 4
    // Terça ==> 3
    // Usar apenas If, Else ou Else if.
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        System.out.println(" Digite um dia da semana para ser convertido em um número: ");
        String dia = leia.next();

        if(dia.equalsIgnoreCase("segunda") ){
            System.out.println("Esse dia é o número 1");
        }else if(dia.equalsIgnoreCase("terça")){
            System.out.println("Esse dia é o número 2");
        }else if(dia.equalsIgnoreCase("quarta")){
            System.out.println("Esse dia é o número 3");
        }else if(dia.equalsIgnoreCase("quinta")){
            System.out.println("Esse dia é o número 4");
        }else if(dia.equalsIgnoreCase("sexta")){
            System.out.println("Esse dia é o número 5");
        }else if(dia.equalsIgnoreCase("sábado")){
            System.out.println("Esse dia é o número 6");
        }else if(dia.equalsIgnoreCase("domingo")){
            System.out.println("Esse dia é o número 7");
        }else{
            System.out.println("DIGITE UM DIA VÁLIDO!!");
        }
        
        leia.close();

    }
}