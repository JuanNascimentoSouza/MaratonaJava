package enummeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nome) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor(){
        return valor;
    }

}
