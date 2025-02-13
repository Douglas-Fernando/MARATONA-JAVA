package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        int salario = 30000;
        if (salario >= 0 && salario <= 34712) {
            System.out.println("9,70% de Imposto "+(salario * 9.70) / 100);
        } else if (salario > 34713 && salario <= 68507) {
            System.out.println("37,35% de Imposto "+(salario * 37.35) / 100);
        }else {
            System.out.println("49,50% de Imposto "+(salario * 49.50) / 100);
        }
    }
}
