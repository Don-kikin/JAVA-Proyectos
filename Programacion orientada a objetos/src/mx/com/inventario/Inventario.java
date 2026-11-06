package mx.com.inventario;

import java.io.StringReader;

public class Inventario {
    private String nombre;
    private double precio;


    public Inventario(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("EL precio no puede ser negativo .");
        }
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}