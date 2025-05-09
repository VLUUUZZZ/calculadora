import java.util.Scanner;

public class sumanumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESA TU PRIMER NUMERO: ");
        int numero1 = scanner.nextInt();

        System.out.println("INGRESA TU SEGUNDO NUMERO: ");
        int numero2 = scanner.nextInt();

        System.out.println("INGRESA TU TERCER NUMERO: ");
        int numero3 = scanner.nextInt();

        System.out.println("INGRESA TU CUARTO NUMERO: ");
        int numero4 = scanner.nextInt();

        int suma = numero1 + numero2 + numero3 + numero4;

        System.out.println("LA SUMA DE LOS 4 NUMEROS ES: " + suma);
    }
}
