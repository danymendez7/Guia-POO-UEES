import java.util.Scanner;//Importamos Scanner

/* Calcule el área total de un cono cualquiera, cuyas medidas de altura y radio son dadas en centímetros, y
la respuesta en pantalla se le presenta en centímetros cuadrados */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Cálcula el área de un cono");

        System.out.println("Introduce el valor de Altura en cm");
        double Altura = sc.nextDouble();


        System.out.println("Introduce el valor de Radio en cm");
        double Radio = sc.nextDouble();

        double Generatriz = Math.sqrt(Math.pow(Radio,2)+Math.pow(Altura,2));
        double AreaTotal = Math.PI* Radio*(Radio+Generatriz);

        System.out.println("El área total del cono es:"+ AreaTotal+"cm^2");





    }
}
