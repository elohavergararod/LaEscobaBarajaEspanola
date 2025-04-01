package input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje, int min, int max) {
        int valor;
        do {
            System.out.print(mensaje + " ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Inténtalo de nuevo: ");
                scanner.next();
            }
            valor = scanner.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }
}
