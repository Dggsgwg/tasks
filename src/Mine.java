import java.text.DecimalFormat;
import java.util.Scanner;

public class Mine {
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public static void task20() {
        System.out.println("Скажите на сколько градусов сдвинулась стрелка часов\nпока Даниил делал гитару из доширака (число от 0 до 360)?");
        int y = scanner.nextInt();

        if (0 <= y & y <= 360) {
            int hours = y / 15;
            int minutes = 0;
            minutes = (y % 15 != 0) ? y % 15 * 60 / 15 : minutes;
            switch (hours) {
                default:
                    switch (minutes) {
                        default:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минут", hours, minutes);
                        case 1, 21, 31, 41, 51:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуту", hours, minutes);
                        case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуты", hours, minutes);
                    }
                case 1, 21:
                    switch (minutes) {
                        default:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минут", hours, minutes);
                        case 1, 21, 31, 41, 51:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуту", hours, minutes);
                        case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуты", hours, minutes);
                    }
                case 2, 3, 4, 22, 23, 24:
                    switch (minutes) {
                        default:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минут", hours, minutes);
                        case 1, 21, 31, 41, 51:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуту", hours, minutes);
                        case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуты", hours, minutes);
                    }

            }

        } else {
            System.out.println("Введите значение от 0 до 360!!!");
        }
    }

    public static void main(String[] args) {
        task20();

    }

}
