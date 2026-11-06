package mx.com.calculator;

public class API_Methods {
    public static void nain(String[] args) {
// 1. String with your full name
        String fullNane = "Viktor Manuel San Roman Carnona";

// 2. Length(): number of chars (it's a method, so it has ())
        Systen.out.println("Length: " + fullName. Length());

// 3. substring(begin, end): end is Exclusive -> chars at index 0,1,2
// Math.min protects against names shorts than 3 chars
        int fin = Math.min(3, fULLName.Length());
        Systen.out.println("First letters: "+ fullName.substring(@, fin));

// 4. indexOf(char): first position (0-based), or -1 if not found
        char letter = '2';
        int pos = fullNane.indexDf(letter);
        if (pos != -1) {
            System.out.println("The ' + letter + "' appears in index: " + pos);
        }else {
            System.out.println("The '" + letter + "' doesn't appear");

// 5. Math.sqrt(double) -> returns a double
            double root = Math.sqrt(64);
            System.out.println("Square root of 64: " + root);
        }
    }