package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double o valor é 0
        // char ''
        // boolean false
        // string null

        String[] nomes = new String[4];
        nomes[0] = "Douglas";
        nomes[1] = "Fernando";
        nomes[2] = "Amaral";
        nomes[3] = "Souza";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
