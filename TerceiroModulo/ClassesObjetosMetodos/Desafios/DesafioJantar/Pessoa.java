package TerceiroModulo.ClassesObjetosMetodos.Desafios.DesafioJantar;

public class Pessoa {
    
    String nome;
    double peso;

Pessoa(String nome, double peso){
this.nome = nome;
this.peso = peso;
}

    void comer(Comida comida){
        if( comida != null){
            this.peso += comida.pesoAlimento;
        }
        
        
    }

    String apresentar(){
        return "Olá, meu nome é " + nome + " e tenho "+ peso+ "kgs.";
    }
}
