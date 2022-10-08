package SegundoModulo.EstruturaDeControle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godam");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            default:
            System.out.println("Não sei nada...");
        }

        System.out.println("Fim da expressão!!");

        int idade = 3;
        switch(idade){
            case 3:
            System.out.println("Sabe programar");
            case 2:
            System.out.println("Sabe falar");
            case 1:
            System.out.println("Sabe andar");
            case 0:
            System.out.println("Sabe respirar");

        }

    }
}
