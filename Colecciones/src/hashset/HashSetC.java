package org.generation.col.hashset;

import java.util.HashSet;

public class HashSetC {
    public static void main(String[] args) {
        //como incializar un hashset
        HashSet<String> username = new HashSet<>();
        //como agregar elementos
        username.add("josuecanov");
        username. add("hola1234");
        username. add( "perroloko");
        System.out.println(username);
        //comprobar si existe el elemento en el hashset
        System.out.println("El elemento josuecanov existe? " + username.contains("josuecanov"));
        System.out.println("El elemento josueCanov existe? " + username.contains("josueCanov"));
        System.out.println("El tamaño del hashset es: " + username.size());
        //obtener cada elemento por separado
        //for mejorado
        for(String user: username){
            System.out.println(user);
        }

        /**
         * pedirle al usuario que ingrese un username utilizando un scanner
         * Si el usuario ya existe en el arraylist mandarle un mensajito "username no disponible"
         * Si no existe "Username disponible"
         */

    }
}
