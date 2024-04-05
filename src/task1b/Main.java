package task1b;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, z;
        int y = 0;
            while (true) {
                System.out.print("Введіть ціле число x: ");
                if (in.hasNextInt()) {
                    x = in.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: Введене значення не є цілим числом.");
                    in.next();
                }
            }
            while (true) {
                System.out.print("Введіть ціле число z: ");
                if (in.hasNextInt()) {
                    z = in.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: Введене значення не є цілим числом.");
                    in.next();
                }
            }
        if (x == 5) {
            y = 3*x+x*z;
        }  if (x == -5) {
            if (z == 7){
                System.out.print("Не можна ділити на 0.");
                System.exit(1);
            }
            y = (2*x*z)/(7-z);
        }  if (x == 0) {
            y = x;
        } if (x != 0 && x != 5 && x != -5) {
            System.out.print("Не задано умовою число x.");
            System.exit(1);
        }
        System.out.printf("Обчислення: %d \n", y);
        in.close();
    }
}
