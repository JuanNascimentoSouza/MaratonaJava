package generics.test;

import generics.domain.Barco;
import generics.domain.Carro;
import generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"),
                        new Carro("Fusca")));

        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Lancha"),
                        new Barco("Canoa")));

    }

}
