package task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть порядковий номер місяця: ");
        int month = in.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Літо";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осінь";
                break;
            default:
                season = "Невідома пора року. Введений неправильний номер місяця.";
                break;
        }
        System.out.println("Пора року: " + season);
        in.close();
    }
}
