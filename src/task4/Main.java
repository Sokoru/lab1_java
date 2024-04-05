package task4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int x, y, z;
            while (true) {
                System.out.print("Введіть число x: ");
                if (in.hasNextInt()) {
                    x = in.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: Введене значення не є цілим числом.");
                    in.next();
                }
            }
            while (true) {
                System.out.print("Введіть число y: ");
                if (in.hasNextInt()) {
                    y = in.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: Введене значення не є цілим числом.");
                    in.next();
                }
            }
            while (true) {
                System.out.print("Введіть число z: ");
                if (in.hasNextInt()) {
                    z = in.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: Введене значення не є цілим числом.");
                    in.next();
                }
            }
            double a = Math.sqrt(Math.pow(x, 2)*y-14*z);
            if (Double.isNaN(a)) {
                System.out.println("Невизначене число.");
            } else {
                System.out.printf("Обчислення: %.2f\n", a);
            }
            in.close();
        }
    }