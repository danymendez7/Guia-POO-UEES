import java.util.Scanner;//Importamos scanner

/*Cálculo del área de una figura geométrica
Pregunte al usuario cuál de los siguientes tipos de área desea calcular:
1. Rectángulo 2. Triangulo 3. Circulo
Luego se piden los datos apropiados de la figura seleccionada y muestra el valor del área final.
Debe avisar a usuario cuando no seleccione alguna de las opciones proporcionadas */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Área de figura geométrica: ");
        System.out.println("1. Rectángulo  2. Triángulo  3.Círculo");
        System.out.print("Seleccione el tipo de área a calcular (1,2 o 3):  ");

        int opcion = Integer.parseInt(sc.nextLine().trim());

        switch (opcion) {
            case 1: {
                System.out.print("Ingrese la base:  ");
                double base = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Ingrese la altura:  ");
                double altura = Double.parseDouble(sc.nextLine().trim());
                double area = base * altura;
                System.out.printf("El área del rectángulo es: %.2f%n", area);
                break;
            }
            case 2: {
                System.out.print("Ingrese la base: ");
                double base = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Ingrese la altura: ");
                double altura = Double.parseDouble(sc.nextLine().trim());
                double area = (base * altura) / 2;
                System.out.printf("El área del triángulo es: %.2f%n", area);
                break;
            }
            case 3: {
                System.out.print("Ingrese el radio: ");
                double radio = Double.parseDouble(sc.nextLine().trim());
                double area = Math.PI * radio * radio;
                System.out.printf("El área del círculo es: %.2f%n", area);
                break;
            }
            default:
                System.out.println("No ha seleccionado una opción válida (1, 2 o 3).");
        }
    }
}
