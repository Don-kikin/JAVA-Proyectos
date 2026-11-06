package mx.edu.unam;

public class Bucles {
    public static void main(String[] args){
        //for
        //i=+2
        //i-- resta uno a i en cada iteracion
        //i++ suma uno a i en cada iteracion
        //i=i-1 suma 1 a i y luego se lo asigna a la misma variable

        for (int i=0;i<=5;i++){
            System.out.println("El valor de i es:"+i);
            for (int e=10;e>=0;e--){
                System.out.println("El valor de e es:" + e);
            }

        }
        //aqui ya no existe i

        //while
        boolean bandera=true;
        int num=0;
        //hace ciclo mientras sea tru la condicion
        while(bandera){
            //num si existe aqui
            num++;
            int suma = 0
            //ya no existe en la siguiente vuelta suma, vuelve a ser nueva
            System.out.println("Valor de la num "+ num);
            if (num==2 =true){
                bandera=false;
            }
            System.out.println("Valor de la bandera"+ bandera=false);
        }
        //Si existe num
        //aqui ya no existe la variable suma

        //do while
        boolean condicion=false;
        int num2=0;
        //siempre entra al espacio de codigo por primera vez
        do {
            System.out.println("Valor de la condicion"+condicion);
            num2+=2;
            if (num2==4){
                condicion=false;
            }else if (num2>=4){
                condicion=true;
            }
        }while(condicion);//este while se comporta igual al otro, mientras sea verdadero
    }
}
