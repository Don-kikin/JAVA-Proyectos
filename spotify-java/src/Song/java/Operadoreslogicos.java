public class OperadoresLogicos {
    public static void main(String[] args) {
        // Uso consistente del tipo primitivo boolean
        boolean varTrue = true;
        boolean varFalse = false;

        // Asignación correcta con el operador '='
        boolean varAnd = (varTrue && (!varTrue)) && (!(varFalse || varTrue));
        //(varTrue && (false)) && (! (varFalse | | varTrue))
        //(false) && (!(true))
        //(false) && (false)
        //false

        boolean varOr = varTrue || varFalse;
        boolean varNot = !varTrue;

        // Impresión correcta usando 'println' y respetando el camelCase de las variables
        System.out.println("varAnd: " + varAnd);
        System.out.println("varOr: " + varOr);
        System.out.println("varNot: " + varNot);
    }
}