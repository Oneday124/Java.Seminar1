// Реализовать простой калькулятор
package seminar1.HomeWork;
import java.util.Scanner;


public class Task7 {
    public static double calc(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = iScanner.nextDouble();
        Scanner iScanner2 = new Scanner(System.in);
        System.out.println("Введите команду (+ - / *): ");
        String operation = iScanner2.nextLine();
        System.out.println("Введите второе чило число: ");
        double y = iScanner.nextDouble();
        double res = switch (operation) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };
        return res;
    }

}
