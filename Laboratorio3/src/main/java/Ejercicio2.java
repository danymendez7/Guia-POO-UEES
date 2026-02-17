import java.util.Scanner;//Importamos scanner

/*Consultado sobre el estado de pensión: solicite el nombre, el sexo y la edad de un empleado, el cual
necesita saber si ya puede jubilarse. Tome en cuenta que un hombre se puede jubilar cuando tenga 60
años o más, en cambio, una mujer mayor se jubilará si tiene más de 54 años */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Consulta estado de pensión (jubilación).
        Hombre: >60 años. Mujer >54 años.
         */
        System.out.println("Estado de pensión (jubilación)");
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el sexo (Masculino/Femenino): ");
        String sexo = sc.nextLine().trim();
        System.out.print("Ingrese la edad: ");
        int edad = Integer.parseInt(sc.nextLine().trim());

        boolean puedeJubilarse = false;
        String sexoNorm = sexo.toUpperCase();
        if (sexoNorm.startsWith("MASCULINO") || sexoNorm.equals("MASCULINO")){
            puedeJubilarse = edad >= 60;
        } else if (sexoNorm.startsWith("FEMENINO") || sexoNorm.equals("FEMENINO")){
            puedeJubilarse = edad > 54;
        }

        System.out.println();
        if (puedeJubilarse) {
            System.out.println(nombre + " ya puede jubilarse.");
        } else {
            System.out.println(nombre + " aún no puede jubilarse.");
        }
    }
}
