package mx.com.herenciaPolimorfismo;

public class Animal {
    private int patas;

    public void emitirSonido() {
        System.out.println("Emitiendo sonido");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public int getPatas(){
        return this.patas;
    }
    public void setPatas(int patas){
        this.patas=patas;
    }
}
