
import java.util.Scanner;

public class Fibonnacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el limite para la serie de Fibonacci: ");

        int limite = scanner.nextInt();
        int a = 0;
        int b = 1;

        while (a <= limite) {
            System.out.print(a+" ");

            int c = a + b;

            a = b;
            b = c;
        }

    }
}
