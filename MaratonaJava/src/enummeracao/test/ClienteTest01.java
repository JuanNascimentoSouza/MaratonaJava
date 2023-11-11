package enummeracao.test;

import enummeracao.dominio.Cliente;
import enummeracao.dominio.TipoCliente;
import enummeracao.dominio.TipoPagamento;

import static enummeracao.dominio.Cliente.TipoPagamento.CREDITO;
import static enummeracao.dominio.Cliente.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

    }
}

