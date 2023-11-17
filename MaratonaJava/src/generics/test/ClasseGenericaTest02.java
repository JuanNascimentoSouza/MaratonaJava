package generics.test;

import generics.domain.Barco;
import generics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por mês");
        barcoRentavelService.retornarCarroAlugado(barco);
    }
}
