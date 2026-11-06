package mx.com.herenciaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Perro objPerro = new Perro();
        objPerro.comer();
        objPerro.emitirSonido();
        objPerro.setPatas(4);
        System.out.println("cuantas patas tiene?" + objPerro.getPatas());

        System.out.println("====>");
        Gato objGato= new Gato("Blacky");
        objGato.comerCarne();
        System.out.println("El nombre del gato es"+objGato.nombre);
    }
}