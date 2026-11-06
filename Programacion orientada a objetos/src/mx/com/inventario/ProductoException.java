package mx.com.inventario;

public class ProductoException extends IllegalArgumentException {
    public ProductoException( String mensaje){
        super (mensaje);
    }
}
