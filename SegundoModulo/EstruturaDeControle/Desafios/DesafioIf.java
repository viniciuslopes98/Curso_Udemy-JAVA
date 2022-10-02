package SegundoModulo.EstruturaDeControle.Desafios;

public class DesafioIf {
    public static void main(String[] args) {
        // Desafio ==> Descubra porque a seguinte condição retorna aprovado:
        double nota = 1.3;

        if (nota >= 9.0)
            ;
        {
            System.out.println("Aprovado com sucesso!");
            System.out.println("Você é fera!!");

        }

        // Resposta: Há ponto e vírgula no final da condição if! O certo seria :

        if (nota >= 9.0) {
            System.out.println("Aprovado com sucesso!");
            System.out.println("Você é fera!!");

        }

    }
}