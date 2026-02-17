import java.util.Scanner;//import scanner

public class Ejercicio4W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Promedio de 5 calificaciones (while)  ");
        double suma = 0;
        int i = 1;
        while (i <= 5) {
            System.out.print("Ingrese calificación " + i + ": ");
            suma += Double.parseDouble(sc.nextLine().trim());
            i++;
        }
        double promedio = suma / 5;
        System.out.printf("El promedio del alumno es %.2f%n", promedio);
    }
}