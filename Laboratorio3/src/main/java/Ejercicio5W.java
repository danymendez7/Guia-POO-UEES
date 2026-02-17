import java.util.Scanner;//import scanner

public class Ejercicio5W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Números desde el primero al segundo (while) ");
        System.out.print("Ingrese el primer número: ");
        int a = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Ingrese el segundo número: ");
        int b = Integer.parseInt(sc.nextLine().trim());
        int paso = a <= b ? 1 : -1;
        int i = a;
        while (paso > 0 ? i <= b : i >= b) {
            System.out.print(i + " ");
            i += paso;
        }
        System.out.println();
    }
}