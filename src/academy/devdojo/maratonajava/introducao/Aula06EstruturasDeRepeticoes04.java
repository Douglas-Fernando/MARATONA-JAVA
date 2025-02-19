package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticoes04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantos ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println(parcela + ": " + valorParcela);

            }else {
                break;
            }

        }
    }
}
