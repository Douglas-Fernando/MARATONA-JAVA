package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticoes01 {
    public static void main(String[] args) {
        // while, do while e for
        int contador = 0;
        while (contador < 10){
            System.out.println(contador); // ou System.out.println(++contador)
            contador += 1; // ou contador++;
        }

    do {
        System.out.println("Dentro do do-while");
    } while (contador < 10);

    for (int i = 0; i < 10; i++){
        System.out.println("For "+i);

    }

    }

}
