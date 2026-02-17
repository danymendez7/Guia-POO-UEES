import java.util.Scanner;//import scanner
    /*Realizar un programa que permita calcular el promedio de un alumno que tiene 5 calificaciones en una
    materia.*/

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Promedio de 5 calificaciones (for)  ");
        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese calificación " + i + ": ");
            suma += Double.parseDouble(sc.nextLine().trim());

        }
        double promedio = suma / 5;
        System.out.printf("El promedio del alumno es: %.2f%n", promedio);

    }
}

