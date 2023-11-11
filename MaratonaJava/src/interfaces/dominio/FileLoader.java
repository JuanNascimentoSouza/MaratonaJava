package interfaces.dominio;


public class FileLoader implements DataLoader,DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados dos arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
}


