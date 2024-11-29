public class PasoReferencia {
    public static void main(String[] args) {
        int[] numero = {10, 20, 30, 40, 50};
        System.out.println("Antes de llamar a modificarArray: " + java.util.Arrays.toString(numero));
        modificarArray(numero);
        System.out.println("Después de llamar a modificarArray: " + java.util.Arrays.toString(numero));
    }
     public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Dentro de modificarArray: " + java.util.Arrays.toString(arr));
    }
}
