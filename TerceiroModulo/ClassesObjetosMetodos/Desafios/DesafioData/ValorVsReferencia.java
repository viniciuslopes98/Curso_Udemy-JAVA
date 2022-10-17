package TerceiroModulo.ClassesObjetosMetodos.Desafios.DesafioData;


public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " "+b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1;//atribuição por referência (Objeto)

        d1.dia =31;
        d2.mes=12;
        d1.ano = 2030;
        
        System.out.println(d1.formatoData());
        System.out.println(d2.formatoData());
        
        voltarDataParaValorPadrao(d1);
        
        System.out.println(d1.formatoData());
        System.out.println(d2.formatoData());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c); // Não haverá mudança pois é do tipo Primitivo, ou seja, criou uma cópia separada
                               // em memória, sendo assim não acessível à incrementação da mesma.

    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia=1;
        d.mes=1;
        d.ano=1970;
    }
    static void alterarPrimitivo(int a){
        a++;
    }



}
