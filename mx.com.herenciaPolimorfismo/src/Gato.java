package mx.com.herenciaPolimorfismo;

public class Gato extends Carnivoro {

    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public void beber(){
        System.out.println("bebiendo ");
    }
}
