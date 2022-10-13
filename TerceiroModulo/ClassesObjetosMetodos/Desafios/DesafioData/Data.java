package TerceiroModulo.ClassesObjetosMetodos.Desafios.DesafioData;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaEscolha, int mesEscolha, int anoEscolha) {
        dia = diaEscolha;
        mes = mesEscolha;
        ano = anoEscolha;
    }

    String formatoData() {
        return String.format("%d/%d/%d", dia, mes, ano);

    }

}
