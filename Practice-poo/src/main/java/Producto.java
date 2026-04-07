import java.util.Scanner;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    /* creamos los metodos */
    public Producto(String nombre,double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double ValorTotal() {
           return cantidad * precio;
    }
    public void MostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad de producto: " + cantidad);
        System.out.println("Total: $" + ValorTotal());
        System.out.println("                      ");
    }
    public void Descuento() {
       precio = precio - (precio * 0.10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* creamos el objeto */
         Producto Camisa = new Producto("Camisa", 10.50, 5);
         Producto Short = new Producto("Short", 5.00, 3);
         Producto Gorra = new Producto("Gorra", 8, 1);

         /* llamamos al metodo */
        Camisa.MostrarInfo();
        Short.MostrarInfo();
        Gorra.MostrarInfo();

         /* imprimos datos */
        double ValorTotal = Camisa.ValorTotal() + Short.ValorTotal() + Gorra.ValorTotal();
        System.out.println("Valor total de la compra: $" + ValorTotal);

    }
}
