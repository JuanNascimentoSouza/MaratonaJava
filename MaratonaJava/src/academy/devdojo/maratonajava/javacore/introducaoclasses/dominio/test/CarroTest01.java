package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Carro Azul";
        carro.modelo = "Kwid";
        carro.ano = 2010;

        carro2.nome = "Carro Vermelho";
        carro2.modelo = "Suv";
        carro2.ano = 2020;

        System.out.println(carro.nome + " " + carro2.nome);
    }
}
