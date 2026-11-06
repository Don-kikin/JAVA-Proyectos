package mx.com.herenciaPolimorfismo;

public abstract class Carnivoro {
    public String nombre;


    public Carnivoro(String nombre){
        this.nombre=nombre;
    }

    public abstract void beber();

    public void comerCarne(){
        System.out.println("Comiendo carne");
    }
}

