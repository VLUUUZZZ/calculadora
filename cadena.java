import java.util.Scanner;

public class cadena {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESCRIBE TU NOMBRE: ");
        nombre = entrada.nextLine();

        System.out.println("ESCRIBE TU APELLIDO: ");
        apellido = entrada.nextLine();

        System.out.println("\nRESULTADO:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre completo: " + nombre + " " + apellido);
    }
}
