import org.generation.gato.model.Gato;

public class Main {
    public static void main(String[] args) {
        //creamos objetos o instanciar la clase
        Gato nami = new Gato("nami",1, "carey");
        Gato july = new Gato("july", 5, "gris");

        nami.makeSound();
        july.makeSound();
    }
}