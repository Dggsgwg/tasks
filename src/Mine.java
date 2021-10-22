import java.text.DecimalFormat;
import java.util.Scanner;

public class Mine {
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat("#.###");

    public static void task20() {
        System.out.println("Скажите на сколько градусов сдвинулась стрелка часов\nпока Даниил делал гитару из доширака (число от 0 до 360)?");
        int y = scanner.nextInt();

        if (0 <= y & y <= 360) {
            int hours = y / 15;
            int minutеs = 0;
            minutеs = (y % 15 != 0) ? y % 15 * 60 / 15 : minutеs;
            switch (hours) {
                default:
                    switch (minutеs) {
                        default:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минут", hours, minutеs);
                        case 1, 21, 31, 41, 51:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуту", hours, minutеs);
                        case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуты", hours, minutеs);
                    }
                case 1, 21:
                    switch (minutеs) {
                        default:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минут", hours, minutеs);
                        case 1, 21, 31, 41, 51:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуту", hours, minutеs);
                        case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуты", hours, minutеs);
                    }
                case 2, 3, 4, 22, 23, 24:
                    switch (minutеs) {
                        default:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минут", hours, minutеs);
                        case 1, 21, 31, 41, 51:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуту", hours, minutеs);
                        case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                            System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуты", hours, minutеs);
                    }

            }

        } else {
            System.out.println("Введите значение от 0 до 360!!!");
        }
    }

    public static void task22() {
        System.out.println("Введите значение температуры в градусах Фаренгейта:");
        double farengeitTemperature = scanner.nextDouble();
        double celsiumTemperature = (farengeitTemperature - 32) / 1.8;
        String answer = decimalFormat.format(celsiumTemperature);
        System.out.println(answer);
    }

    public static void task23(){
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

        double length = Math.abs(Math.sqrt((Math.pow((x2-x1),2))+Math.pow((y2-y1),2)+Math.pow((z2-z1),2)));
        String answer = decimalFormat.format(length);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        //task20();
        //task22();
        task23();
    }

}
