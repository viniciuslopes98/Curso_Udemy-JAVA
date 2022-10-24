package QuartoModulo.ArraysCollections;

import java.util.Arrays;


public class Array {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double TotalAlunoA = 0;
        for(int i=0; i < notasAlunoA.length; i++){
            TotalAlunoA += notasAlunoA[i];
        }
        System.out.println(TotalAlunoA / notasAlunoA.length);

        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10};

        double TotalAlunoB = 0; 
        for (int i = 0; i < notasAlunoB.length; i++) {
            TotalAlunoB += notasAlunoB[i];
        }
        System.out.println(TotalAlunoB / notasAlunoB.length);

    }
}
