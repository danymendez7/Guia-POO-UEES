import java.util.Scanner;

public class Mascota {
        String nombre;
        int edad;
        String tipo;
        String raza;
        boolean tienehambre = true;
        boolean tienesueño = true;
        boolean tienevacunas = true;

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        /* creamos el objeto */

        Mascota miMascota = new Mascota();

        /* imprimimos los datos */

        System.out.print("Ingrese el nombre de la mascota: ");
        miMascota.nombre = sc.nextLine();
        System.out.print("Ingrese la edad de la mascota: ");
        miMascota.edad = sc.nextInt();
        System.out.print("Ingrese el tipo de la mascota: ");
        miMascota.tipo = sc.nextLine();
        System.out.print("Ingrese la raza de la mascota: ");
        miMascota.raza = sc.nextLine();
        System.out.print("¿La mascota tiene hambre? (Si/No)");
        miMascota.tienehambre = sc.nextBoolean();
        System.out.print("¿La mascota tiene sueño? (Si/No): ");
        miMascota.tienesueño = sc.nextBoolean();
        System.out.print("¿La mascota esta vacunad? (Si/No): ");
        miMascota.tienevacunas = sc.nextBoolean();

        /* llamamos a los objetos */
        System.out.println("Estado de la mascota:");
        miMascota.comer();
        miMascota.sueño();
        miMascota.vacunas();
    }

    public void comer() {
             if (tienehambre) {
                 System.out.println("La mascota tiene hambre");
             } else {
                 System.out.println("La mascota no tiene hambre");
             }
        }
         public void sueño() {
             if (tienesueño)  {
                 System.out.println("La mascota tiene sueño");
             } else {
                 System.out.println("La mascota no tiene sueño");
             }
         }

         public void vacunas() {
             if (tienevacunas) {
                 System.out.println(nombre + " está vacunado/a");
             } else {
                 System.out.println(nombre + " no está vacunado/a");
             }
         }
     }





