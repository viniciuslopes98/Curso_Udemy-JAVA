package PrimeiroModulo.fundamentos.operadores;

public class DesafioAritmetico {
    public static void main(String[] args) {
        
        // int a = 3 *4 - 10;
        // int b = (int)Math.pow(a, 3);

        var a = 6*(3+2);
        var valueA = Math.pow(a, 2);
        System.out.println(valueA);
        
        var b = (2-7)*(1-5);
        var valueB = Math.pow(b, 2);
        valueB = valueB / 2;
        System.out.println(valueB);
        
        valueA = valueA / (3*2);
        System.out.println(valueA);

        valueB = valueB / 2;
        System.out.println(valueB);

        var valueAB = valueA - valueB;
        var divisor = Math.pow(10, 3);
        valueAB = Math.pow(valueAB, 3);
        var resultado =  valueAB / divisor;

        System.out.println("O resultado deste desafio é "+(int)resultado);

    }
}
