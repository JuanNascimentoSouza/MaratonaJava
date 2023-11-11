package associacao.test;

import associacao.dominio.Escola;
import associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jyraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();



    }
}
