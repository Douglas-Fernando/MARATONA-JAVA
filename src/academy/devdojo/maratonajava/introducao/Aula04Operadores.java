package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // - + / *
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero2 + numero1;
        System.out.println(resultado);

        // %   RESTO DA DIVISÃOz
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezEigualOuMaiorQueVinte = 10 >= 20;
        boolean isDezEigualOuMenorQueVinte = 10 <= 20;
        boolean isDezEdiferenteDeVinte = 10 != 20;
        boolean isDezEigualVinte = 10 == 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezEigualOuMaiorQueVinte);
        System.out.println(isDezEigualOuMenorQueVinte);
        System.out.println(isDezEigualVinte);
        System.out.println(isDezEdiferenteDeVinte);

        // && -> (AND) || -> (OR)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // soma de 1 e 1
        contador--; // subtrai de 1 e 1
        System.out.println(contador);
    }
}
