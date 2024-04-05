import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x0, y0, R, x1, y1;
        while (true) {
            System.out.print("Введіть координати центра круга (x0): ");
            if (in.hasNextDouble()) {
                x0 = in.nextDouble();
                break;
            } else {
                System.out.println("Помилка: Введене значення не є десятковим числом.");
                in.next();
            }
        }
        while (true) {
            System.out.print("Введіть координати центра круга (y0): ");
            if (in.hasNextDouble()) {
                y0 = in.nextDouble();
                break;
            } else {
                System.out.println("Помилка: Введене значення не є десятковим числом.");
                in.next();
            }
        }
        while (true) {
            System.out.print("Введіть радіус круга R: ");
            if (in.hasNextDouble()) {
                R = in.nextDouble();
                break;
            } else {
                System.out.println("Помилка: Введене значення не є десятковим числом.");
                in.next();
            }
        }
        while (true) {
            System.out.print("Введіть координати точки A (x1): ");
            if (in.hasNextDouble()) {
                x1 = in.nextDouble();
                break;
            } else {
                System.out.println("Помилка: Введене значення не є десятковим числом.");
                in.next();
            }
        }
        while (true) {
            System.out.print("Введіть координати точки A (y1): ");
            if (in.hasNextDouble()) {
                y1 = in.nextDouble();
                break;
            } else {
                System.out.println("Помилка: Введене значення не є десятковим числом.");
                in.next();
            }
        }
        double distance = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
        if (distance < R) {
            System.out.println("Точка знаходиться всередині круга.");
        } else if (distance == R) {
            System.out.println("Точка знаходиться на окружності круга.");
        } else {
            System.out.println("Точка знаходиться поза кругом.");
        }
        in.close();
    }
}
