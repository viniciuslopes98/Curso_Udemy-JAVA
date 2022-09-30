package PrimeiroModulo.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        
        double a = 1; //conversao implicita
        System.out.println(a);
        
        float b = (float) 1.12345; //conversao explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte)c;//conversao explicita (CAST)
        System.out.println(d);

            double e = 1.0;
            int f = (int)e;
            System.out.println(f);
    }
}
