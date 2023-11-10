package modificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //quando static está ativo this não pode ser usado
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime (){
        System.out.println("------------");
        System.out.println("Nome" + this.nome);
        System.out.println("Velocidade maxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + this.velocidadeLimite);


    }
}
