import java.util.Scanner;

public class Tres{

    public static void main(String[] args) {
        //
        int i;
        int suma = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dijite un número entero positivo: ");
        n = sc.nextInt();

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                suma = suma + i;
                System.out.println("Divisores del numero " + n + "es: " + i);
            }
        }
        if (suma == n) {
            System.out.println( n + " es un numero perfecto");
        } else {
            System.out.println(n + " no es un numero perfecto");

        }
    }

}
