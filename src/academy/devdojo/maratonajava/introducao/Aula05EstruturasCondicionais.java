package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoBebida = idade >= 18;
        if(isAutorizadoBebida){
            System.out.println("Autorizado");
        }
        // !
        if (!isAutorizadoBebida){
            System.out.println("Não Autorizado");
        }
        System.out.println("Fora do if");
    }
}
