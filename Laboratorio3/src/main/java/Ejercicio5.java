import java.util.Scanner;//import scanner

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número desde el primero al segundo (for)");
        System.out.print("Ingrese el primer número: ");
        int a = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Ingrese el segundo número: ");
        int b = Integer.parseInt(sc.nextLine().trim());
        int paso = a <= b ? 1 : -1;
        for (int i = a; (paso > 0 ? i <= b : i >= b); i += paso) {
            System.out.print(i + "");
        }
        System.out.println();
    }
}

