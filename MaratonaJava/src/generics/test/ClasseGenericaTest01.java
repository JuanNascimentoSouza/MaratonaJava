package generics.test;

import generics.domain.Carro;
import generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por mês");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
