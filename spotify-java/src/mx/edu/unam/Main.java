package mx.edu.unam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();

        System.out.println("Termino su servicio social?");
        boolean social=scanner.nextBoolean()

        System.out.println("Es becado?");
        boolean becado= scanner.nextBoolean()

    }

        CompletedCourses completedCourses=new  CompletedCourses(total: 28);
        ApprovedCourses approvedCourses=new ApprovedCourses(total: 26);
        Tultion tultion=new Tultion(paid: true);
        Library library=new Library(bookReturned: true);
        Student student=new Student(id: 200L,  name: "Jorge", approvedCourses, completedCourses, library, tultion);

        if(social) {
        System.out.println("El estudiante: "+student.name+"Puede graduarse" + student.canGradutate());

        else if(becado) {
            System.out.println("El estudiante: " + student.name + " Si tiene heca perg no tiene servicio social");
        }else {
            System.out.println("El estudiante: " + student.name + " No tiene su servicio social");
        }

        switch (age) {
            case 15:
                //se puede agregar bloque de codigo
            System.out.printin("El estudiante: " + student.name + " tiene " + age + "años y es genio");
            break;
        case 20:
            System.out.printin("El estudiante: " + student.name + " tiene " + age + "adelantado");
        case 22:
            System.out.println("El estudiante: " + student.name + "tiene " + age + " es normal");
            break;
        case 25:
            System.out.println("El estudiante: " + student.name + " tiene " + age + " se retraso un poco");
            break;
        case 30:
            System.out.println("El estudiante: " + student. name + " tiene " + age + " no tiene prisa");
            break;
        default:
            System.out.println("Es memo");
