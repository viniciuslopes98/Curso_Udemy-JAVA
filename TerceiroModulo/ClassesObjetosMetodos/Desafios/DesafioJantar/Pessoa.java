package TerceiroModulo.ClassesObjetosMetodos.Desafios.DesafioJantar;

public class Pessoa {
    
    String nome;
    double peso;

Pessoa(String nome, double peso){
this.nome = nome;
this.peso = peso;
}

    double Comer(double pesoAlimento, String nome){
        
        return peso + pesoAlimento;
        
    }

}
