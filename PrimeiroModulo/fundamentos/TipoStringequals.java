package PrimeiroModulo.fundamentos;

import java.util.Scanner;

public class TipoStringequals {
    public static void main(String[] args) {
        
        //Não utilizar ' == ' para comparar valores de Strings. 
        //Nem sempre irá retornar o valor do conteúdo. Exemplo:
        
        System.out.println("2" == "2");
        
        Scanner leia = new Scanner(System.in);
        var s = leia.next();
        
        
        System.out.println("2" == s);
        System.out.println("2".equals(s));

    }
}
