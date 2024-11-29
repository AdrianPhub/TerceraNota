import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        int acumulador = 1;
        int i = 1;
        while (i <= numero ) {
            acumulador *= i;
            i++;
            
        }
        System.out.println("El factorial de: " +numero +" es: " +acumulador);
        
    }
    
}