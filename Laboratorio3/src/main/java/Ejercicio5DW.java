import java.util.Scanner;//import scanner

public class Ejercicio5DW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Números desde el primero al segundo (do-while)");
        System.out.print("Ingrese el primer número: ");
        int a = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Ingrese el segundo número: ");
        int b = Integer.parseInt(sc.nextLine().trim());
        int paso = a <= b ? 1 : -1;
        int i = a;
        do {
            System.out.print(i + " ");
            i += paso;
        } while (paso > 0 ? i <= b : i >= b);
        System.out.println();
    }
}