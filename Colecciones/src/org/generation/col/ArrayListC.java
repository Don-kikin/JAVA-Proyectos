package org.generation.col.arraylist;

import java.sql.Struct;
import  java.util.ArrayList;

public class ArrayListC {
    public static void main(String[] args) {
        //Es una estructura de datos ordenada, y de tamaño dinamico
        ArrayListC<String> nombres = new ArrayListC<>();
        nombres.add("Viktor");
        nombres.add("Jocelin");
        nombres.add("Jacob");

        System.out.println("El elemento  en el indice 0 es " + nombres.get(0));
        System.out.println("Obteniendo el tamaño del array list" + nombres.size());
        System.out.println("Eliminando el elemento en el indice 2 cuyo valor es" + nombres.remove(2));
        System.out.println("Obteniendo el tmaño del array list" + nombres.size());

        //index of
        System.out.println("Obteniendo el indice de Jocelin " + nombres.indexOf("Jocelin"));
        System.out.println("Obteniendo el indice de Jocelin " + nombres.indexof("Jocelin"));
        System.out.println("Probando la salida de un valor que no existe e deberia ser " + nombres.indexof ("Josue"));
        //Usando un bucle for agregar 10 nombres mas a su arraylist
        int size = nombres.size();
        for (int i = size; i <size+ 10; i++){
            nombres.add("Josue " + i);
            System.out.println(nombres.get(i));
        }
        //for mejorado o enchanced
        for (String nombre: nombres){
            System.out.println(nombre);
        }
        //for each 2
        nombres.forEach(nombre -> System.out.println ("Con forEach" + nombre));
        /**
         * Haciendo uso del scanner y un bucle (recomendado while) recolectar 5 calificaciones
         * Estas calificaciones deben ser guardadas en un arraylist de calificaciones (Double, Float)
         * En el operador diamante solo admite tipos de datos compuesto wrapper int Integer, double Double
         * 1. Mostrar en pantalla todas las calificaciones
         * 2. El promedio
         * 3. La calificacion mas alta, usar si quieren Math
         */

//actividad de uso de scanner

//se declara objeto de scanner
Scanner scanner = new Scanner(System.in);
ArrayList<Double> calificaciones = new ArrayList<>();

//pedir entradas de calificaciones
int contador = 0;
        while (contador < 5) {
        System.out.print("Ingresa la calificacion " + (contador + 1) + ": ");
double calificacion = scanner.nextDouble();
            calificaciones.add(calificacion);
contador++;
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (Double cal : calificaciones) {
        System.out.println(cal);
        }

//acumulador
double suma = 0;
        for (Double cal : calificaciones) {
suma += cal;
        }
double promedio = suma / calificaciones.size();
        System.out.printf("\nPromedio: %.2f\n", promedio);

//calificación mas alta
double calificacionMasAlta = calificaciones.get(0);
        for (Double cal : calificaciones) {
calificacionMasAlta = Math.max(calificacionMasAlta, cal);
        }
                System.out.println("Calificacion mas alta: " + calificacionMasAlta);

        scanner.close();
    }
}
