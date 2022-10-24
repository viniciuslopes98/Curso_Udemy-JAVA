package QuartoModulo.ArraysCollections.Desafios.DesafioForeach;


public class DesafioForeach {
    public static void main(String[] args) {
        
        double matematica = 8.0;
        double portugues = 6.0;
        double quimica = 5.0;
        double fisica = 3.0;

        double[] materias = {matematica,portugues,quimica,fisica};

        for(double notas: materias){
            System.out.println(notas);
        }
        
    }
}
