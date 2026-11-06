package org.generation.gato.model;

import javax.imageio.stream.ImageInputStream;

public class Gato {
    //atributos
    String name;
    int age;
    String color;

    /**
     * Metodo constructor
     * Es un metodo especial, que se llama igual que la clase
     * por ejemplo clase Gato, metodo constructor Gato
     * Este metodo se ejecuta al momento de crear un objeto
     * con la palabra reservada new
     *
     * Objetivo de este metodo
     * es asignarles valores a las caracteristicas del objeto
     * los atributos
     */

    public Gato(String name, int age, String color ){
        this.name = name;
        this.age = age;
        this.color= color;

    }

    public void makeSound(){
        System.out.println(this.name + "Hace miau ");
    }
}
