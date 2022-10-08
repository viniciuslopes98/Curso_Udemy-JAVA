package SegundoModulo.EstruturaDeControle.Desafios;

public class DesafioFor {
    public static void main(String[] args) {
        
        String valor = "#";
        for(int i =1; i<=5; i++){
            System.out.println(valor);
            valor +="#";
        }

        // Desafio: Criar o mesmo resultado no console que o código acima (Efeito escada)
        // sem usar valores núméricos.
        
        for(String x = "#";!x.equals("######");x += "#"){
            
            System.out.println(x);
            
        }

    }
}
