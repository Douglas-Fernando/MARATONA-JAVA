package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // < 15 categoria infantil
        // >= 15 && idade < 18 categoria juvenil
        // >= 18 categoria adulto
        int idade = 17;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";;
        }else {
            categoria = "Categoria Adulta";;
        }
        System.out.println(categoria);
    }
}
