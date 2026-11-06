public class Song {
    String title;
    String artist;
    int duration;

    //Variables primitivas
    int duracion=1;
    char caracter="a";
    double decimal=13.3;//64 bitsm se utiliza en la mayoria de los calculos decimales
    boolean booleanVariable=true; //true o false
    long longVariable=2; //tipo entero pero con espacio mas grande en la memoria

    float float2=2.4f;//32 bits, usa f minuscula o mayuscula
    float float3=(float) 12.5;
    byte byteVariable=3;
    short shortVariable=3;

    // variables de clase
    //String,integer, double, float,

    String cadena="cadena de caracteres";
    Integer integerVariable=1;
    Long longVar=34L;
    Double doubleVariable=3,4;
    Float floatVar=4.5f;
    Character characterVar="d";

    String edad="45";
    Integer entero= Integer.parseInt(edad);

    //String, Integer, Double,Float
    public Song (){
        System.out.println("Creando el objeto desde el constructor");
    }

    public Song2(String title, String artist, int duration){
        System.out.println("Creando el objeto desde el constructor sobrecargado");
        this.title=title;
        this.artist=artist;
        this.duration=duration;
    }

    void play(){
        System.out.println("Playing: "+ title);
    }
}


