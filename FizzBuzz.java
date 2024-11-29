public class FizzBuzz {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 100;

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                System.out.println(" ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                System.out.println(" ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                System.out.println(" ");
            }
        }

    }
}
