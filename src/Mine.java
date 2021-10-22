import java.text.DecimalFormat;
import java.util.Scanner;

public class Mine {
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat("#.###");

    public static void task20() {
        int hours = 0;
        int minutes = 0;
        System.out.println("Скажите на сколько градусов сдвинулась стрелка часов\nпока Даниил делал гитару из доширака (число от 0 до 360)?");
        int y = scanner.nextInt();

        if (0 <= y & y <= 360) {
            hours = y / 15;
            minutes = 0;
            minutes = (y % 15 != 0) ? y % 15 * 60 / 15 : minutes;
            if (hours == 1 | hours == 21) {
                switch (minutes) {
                    case 0:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час", hours);
                        break;
                    case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минут", hours, minutes);
                        break;
                    case 21, 31, 41, 51:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуту", hours, minutes);
                        break;
                    case 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуты", hours, minutes);
                        break;
                }
            }
            if (hours == 2 | hours == 3 | hours == 4 | hours == 22 | hours == 23 | hours == 24) {
                switch (minutes) {
                    case 0:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа", hours);
                        break;
                    case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минут", hours, minutes);
                        break;
                    case 21, 31, 41, 51:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуту", hours, minutes);
                        break;
                    case 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуты", hours, minutes);
                        break;
                }
            }
            if(hours == 0 | hours >=5 & hours<=20) {
                switch (minutes) {
                    case 0:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов", hours);
                        break;
                    case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минут", hours, minutes);
                        break;
                    case 21, 31, 41, 51:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуту", hours, minutes);
                        break;
                    case 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуты", hours, minutes);
                        break;
                }
            }
        } else {
            System.out.println("Введите значение от 0 до 360!!!\n");
            task20();
        }
    }

    public static void task22() {

        System.out.println("Введите значение температуры в градусах Фаренгейта:");
        double farengeitTemperature = scanner.nextDouble();
        double celsiumTemperature = (farengeitTemperature - 32) / 1.8;
        String answer = decimalFormat.format(celsiumTemperature);
        System.out.println(answer);
    }

    public static void task23() {
        System.out.println("Введите координату x первого корабля:");
        double x1 = scanner.nextDouble();
        System.out.println("Введите координату y первого корабля:");
        double y1 = scanner.nextDouble();
        System.out.println("Введите координату z первого корабля:");
        double z1 = scanner.nextDouble();

        System.out.println("Введите координату x второго корабля:");
        double x2 = scanner.nextDouble();
        System.out.println("Введите координату y второго корабля:");
        double y2 = scanner.nextDouble();
        System.out.println("Введите координату z второго корабля:");
        double z2 = scanner.nextDouble();

        double length = Math.abs(Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2)));
        String answer = decimalFormat.format(length);
        System.out.println(answer);
    }

    public static void menu() {

        boolean status = false;
        System.out.println("Введите номер задачи которую хотите решить:");
        String command = scanner.nextLine();
        if (command.equals("20")) {
            task20();
            status = true;
            menu();
        }
        if (command.equals("22")) {
            task22();
            status = true;
            menu();
        }
        if (command.equals("23")) {
            task23();
            status = true;
            menu();
        }
        if (command.equals("exit") | command.equals("Exit")) {
            System.exit(228);
        }
        if (status == false) {
            System.out.println("Введите корректное значение!!!!!!!!!!!");
            menu();
        }
    }

    public static void main(String[] args) {

        //menu();

        task20();
        //task22();
        //task23();
    }

}
