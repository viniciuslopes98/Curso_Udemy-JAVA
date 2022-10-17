package TerceiroModulo.ClassesObjetosMetodos;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.6);
        //a1.pi = 10;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(8.6);
        //a2.pi = 15;
        System.out.println(a2.area());

        //AreaCirc.PI = 13.1415;
        System.out.println(AreaCirc.PI);
    }
}
