package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // tipos de Arrays
        int[] numeros2 = {1,2,3,4,5}; // tipos de Arrays
        int[] numeros3 = new int[]{1,2,3,4,5}; // tipos de Arrays

     /*   for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }*/
        // for simplificado
        for(int num : numeros3){
            System.out.println(num);
        }

    }
}
