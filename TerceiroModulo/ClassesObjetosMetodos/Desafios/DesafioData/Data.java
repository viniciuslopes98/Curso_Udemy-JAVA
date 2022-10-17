package TerceiroModulo.ClassesObjetosMetodos.Desafios.DesafioData;

public class Data {
    
    static double pi = 3.14;
    int dia;
    int mes;
    int ano;

    Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    }

    String formatoData() {
        return String.format("%d/%d/%d", dia, mes, ano);

    }

}
