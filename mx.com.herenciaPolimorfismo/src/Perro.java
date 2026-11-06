package mx.com.herenciaPolimorfismo;

public class Perro extends Animal {

    @Override
    public void comer(){
        System.out.println("El perro esta comiendo");
    }

    @Override
    public void respirar(){
        System.out.println("Respirando");

    }

    @Override
    public void dormir(){
        System.out.println("Durmiendo");

    }
}


