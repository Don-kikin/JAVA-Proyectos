import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1. Solicitar una frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Paso 2. Preparar la frase (convertir a minúsculas y dividir con split)
        frase = frase.toLowerCase();
        String[] palabras = frase.split(" ");

        // Paso 3. Crear el HashMap
        HashMap<String, Integer> contador = new HashMap<>();

        // Paso 4. Recorrer las palabras y contabilizar frecuencias
        for (String palabra : palabras) {
            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                contador.put(palabra, 1);
            }
        }

        // Paso 5. Mostrar los resultados con un ciclo for-each
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}