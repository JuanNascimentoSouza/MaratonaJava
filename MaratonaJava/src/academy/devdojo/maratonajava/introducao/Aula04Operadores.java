package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        double resultado = numero1 / (double) numero2;

        System.out.println(resultado);

        int resto = 21 % 7;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade >= 30 && salario >= 3381;


        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente= 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPLaystationCincoCompravel = valorTotalContaCorrente > valorTotalContaPoupanca || valorTotalContaPoupanca > valorTotalContaCorrente;
        System.out.println("isPlaystationCincoCompravel "+isPLaystationCincoCompravel);


        double bonus = 1800;
        bonus += 1800;
        bonus -= 1800;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);
    }
}

