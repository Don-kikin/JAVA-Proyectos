import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorPalabras_getOrDefault {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1. Solicitar una frase
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Paso 2. Preparar la frase
        frase = frase.toLowerCase();
        String[] palabras = frase.split(" ");

        // Paso 3. Crear el HashMap
        HashMap<String, Integer> contador = new HashMap<>();

        // Paso 4. Recorrer las palabras usando getOrDefault
        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        // Paso 5. Mostrar los resultados
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}