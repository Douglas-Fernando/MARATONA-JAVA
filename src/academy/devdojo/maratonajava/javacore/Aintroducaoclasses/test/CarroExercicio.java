package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        // carro 1
        carro.nome = "Ford";
        carro.modelo = "Ranger";
        carro.ano = 2025;

        carro = carro1; // métodos

        // carro 2
        carro1.nome = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2024;

        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
    }
}
