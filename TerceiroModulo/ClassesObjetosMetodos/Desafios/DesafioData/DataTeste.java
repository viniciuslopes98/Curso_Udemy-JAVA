package TerceiroModulo.ClassesObjetosMetodos.Desafios.DesafioData;

public class DataTeste {
    public static void main(String[] args) {
       
        Data data1 = new Data();

        Data data2 = new Data(12, 12, 1912);

        System.out.println("Primera data: " + data1.formatoData());
        System.out.print("Segunda data: " + data2.formatoData());
        System.out.print("\nO valor de pi é: "+Data.pi);
        

    }

}
