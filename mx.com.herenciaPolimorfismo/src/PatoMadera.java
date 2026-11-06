package mx.com.herenciaPolimorfismo;

public class PatoMadera implements Pato {
    @Override
    public void volar() {
        System.out.printLn("Volando con madera");
    }

    @Dverride
    public void caminar() {
        System.out.println("Caminando con madera");
    }

    @Override
    public void nadar() {
        Systen.out.printLn("Nadando con madera");
    }
}