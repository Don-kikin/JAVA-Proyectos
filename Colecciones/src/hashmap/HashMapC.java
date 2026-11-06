package org.generation.col.hashmap;

import java.util.HashMap;

public class HashMapC {
    public static void main(String[] args) {
        //inicializar un hashmap
        //operador diamante recibe 2 argumentos...
        HashMap<String, Integer> edades = new HashMap<>();
        //agregar elementos
        edades.put("Josue", 32);
        //que pasa si intentamos poner la misma llave? Respuesta: Se sobrescribe el valor anterior
        edades.put("Marina", 31);
        //obtener el valor asociado a una llave
        System.out.println("La edad de Josue es " +  edades.get("Josue"));
        System.out.println("La edad de Argelia es " + edades.get("Argelia"));
        //obtener su tamaño
        System.out.println("El tamaño del map es" + edades.size());
        //borrar llave
        System.out.println(edades.remove("Mariana"));
        System.out.println("El tamano del map es: " + edades.size());
        //keySet es un metodo que nos permite obtener todas las llaves, en un set
        var setLlaves = edades.keySet();
        for(String key : setLlaves) {
            System.out.println("La llave " + key + " tiene el valor " + edades.get(key));
    }
}