package PrimeiroModulo.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do seu ultimo salario: ");
        String UltimoSalario = leia.nextLine();

        System.out.println("Digite o valor do seu penúltimo salario: ");
        String PenultimoSalario = leia.nextLine();

        System.out.println("Digite o valor do seu antipenultimo salario: ");
        String AntPSalario = leia.nextLine();
        
        double Resultado1 = Double.parseDouble(UltimoSalario);
        double Resultado2 = Double.parseDouble(PenultimoSalario);
        double Resultado3 = Double.parseDouble(AntPSalario);
        
        double media = (Resultado1+ Resultado2 +Resultado3)/3;
        System.out.println("A media dos salrios é " + media);

        leia.close();
        
       



    }
}
