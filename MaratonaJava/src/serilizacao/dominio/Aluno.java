package serilizacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 4469512149469772990L;

    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;
    private static final String NOME_ESCOLA = "Dev Dojo Viradão no Jiraya";



    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola ='" + NOME_ESCOLA + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do contrutor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
}
