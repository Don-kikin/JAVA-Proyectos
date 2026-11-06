package mx.com.inventario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Inventario>productos = new ArrayList<>();
            ArrayList.add(new ListaProductos( "platano", 10);
            ArrayList.add(new ListaProductos( "manzana", 7);
            ArrayList.add(new ListaProductos("uvas", 35);
        } catch (IllegalArgumentException ex) {
            System.out.println("El precio debe ser mayor a 0");
            System.out.println(ex.getMessage());
        }
        for (inventario producto : ArrayList){
            System.out.println("Nombre producto: " + producto.getNombre() + "precio: " + producto.getPrecio);
        }

    }
}