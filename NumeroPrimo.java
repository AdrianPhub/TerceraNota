import java.util.Scanner;

public class NumeroPrimo {
    // Rango de 1 a 100
    static final int NUM1 = 1;
    static final int NUM2 = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        numeroPrimo(numero);
        rangoNumeroPrimo(NUM1, NUM2);

        scanner.close();
    }

    public static void numeroPrimo(int numero) {
        boolean esPrimo = true;
        if (numero < 2) {
            esPrimo = false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("Es un número primo: " + numero);
            System.out.println("----------------------");
        } else {
            System.out.println("No es un número primo: " + numero);
            System.out.println("----------------------");
        }
    }

    public static void rangoNumeroPrimo(int num1, int num2) {
        System.out.println("Inicio del rango entre:" + NUM1 + " y " + NUM2);
        System.out.println("----------------------");
        for (int i = num1; i <= num2; i++) {
            boolean esPrimo = true;
            if (i < 2) {
                esPrimo = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("Es un número primo: " + i);
                System.out.println("----------------------");
            }
        }
    }
}