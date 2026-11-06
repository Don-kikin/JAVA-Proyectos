package mx.com.animales;

public class Main {

    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("Max", 3),
                new Gato("Luna", 2),
                new Vaca("Lola", 5),
                new Caballo("Spirit", 4)
        };

        for (Animal animal : animales) {
            animal.mostrarInformacion();
            animal.hacerSonido();

            Movible animalMovible = (Movible) animal;
            animalMovible.moverse();
        }
    }
}