package colecoes.test;

import colecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iphone");
        Smartphone s2 = new Smartphone("1ABC1","iphone");
        //Smartphone s2 = s1;
        System.out.println(s1.equals(s2));
    }

}
