import java.util.Scanner;

/**
 * Created by adrian on 03.09.16.
 */
public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w sumatorze dwóch liczb! Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator();

        System.out.println("Suma wynosi: "+calculator.sum(a,b));
    }
}
