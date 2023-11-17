package generics.test;

import generics.domain.Animal;
import generics.domain.Cachorro;
import generics.domain.Gato;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest01 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
