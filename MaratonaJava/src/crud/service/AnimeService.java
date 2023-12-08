package crud.service;

import crud.dominio.Anime;
import crud.dominio.Producer;
import crud.repository.AnimeRepository;
import crud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1 -> find();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void find() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s EP: %d Producer: %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    private static void delete() {
        System.out.println("Type the id of the anime you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if (choice.equalsIgnoreCase("s")) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime:");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes:");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer:");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update() {
        System.out.println("Type the id of the anime:");
        Optional<Anime> optionalProducer = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (optionalProducer.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDB = optionalProducer.get();
        System.out.println("Anime Found" + animeFromDB);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDB.getName() : name;

        System.out.println("Type the new number of episodes or enter to keep the same");
        String episodesTyped = SCANNER.nextLine();
        int episodes = episodesTyped.isEmpty() ? animeFromDB.getEpisodes() : Integer.parseInt(episodesTyped);


        Anime producerToUpdate = Anime.builder()
                .id(animeFromDB.getId())
                .name(name)
                .episodes(episodes)
                .producer(animeFromDB.getProducer())
                .build();
        AnimeRepository.update(producerToUpdate);
    }
}