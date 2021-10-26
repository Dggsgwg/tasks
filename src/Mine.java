import java.text.DecimalFormat;
import java.util.Scanner;

public class Mine {

    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat decimalFormat = new DecimalFormat("#.###");
    static String command = "skip";
    static double temp;
    static int hours, mins;

    interface TimeTransaltion {
        void timeTranslation();
    }

    public static void task11() {
        TimeTransaltion timeTranslation = new TimeTransaltion() {
            public void timeTranslation() {
                hours = 0;
                int tempInt = (int) temp;
                double tempMinsDouble = (temp - tempInt);
                String tempStringMins = decimalFormat.format(tempMinsDouble);
                tempStringMins = tempStringMins.replace(',', '.');
                tempMinsDouble = Double.parseDouble(tempStringMins);
                mins = (int) (tempMinsDouble * 100);

                if (mins > 60) {
                    System.out.println("Введите правильное время в формате x,y где x - время в часах, y - время в минутах");
                    System.exit(228);
                }

                for (int i = 0; i < tempInt; i++) {
                    if ((temp - 1) >= 0) {
                        hours++;
                        temp--;
                    }
                }
                System.out.println(hours + ":" + mins);
            }
        };
        System.out.println("Введите время которое ученик тратит на выполнение одной лабы в формате x,y где x - время в часах, y - время в минутах");
        temp = scanner.nextDouble();
        timeTranslation.timeTranslation();
        int realTimeOfDoinglabsHours = hours;
        int realTimeOfDoinglabsMins = mins;
        System.out.println("Введите время которое ученик сидел за столом и имитировал деланье лаб в формате x,y");
        temp = scanner.nextDouble();
        timeTranslation.timeTranslation();
        int doingLabsHours = hours;
        int doingLabsMins = mins;
        System.out.println("Введите время которое ученик ковырял в носу и думал о шавухах в формате x,y");
        temp = scanner.nextDouble();
        timeTranslation.timeTranslation();
        int thinkingAboutShavuhaHours = hours;
        int thinkingAboutShavuhaMins = mins;
        System.out.println("Введите время которое ученик играл в доту в формате x,y playingDotaHours");
        temp = scanner.nextDouble();
        timeTranslation.timeTranslation();
        int playingDotaHours = hours;
        int playingDotaMins = mins;
        System.out.println("Введите время которое ученик искал в интернете неприличные мемы про преподавателя в формате x,y");
        temp = scanner.nextDouble();
        timeTranslation.timeTranslation();
        int searchingExplictMemesHours = hours;
        int searchingExplictMemesMins = mins;
        System.out.println("Введите время которое ученик рисовал неприличные мемы про преподавателя в формате x,y");
        temp = scanner.nextDouble();
        timeTranslation.timeTranslation();
        int makingExplictMemesHours = hours;
        int makingExplictMemesMins = mins;

        int finalCount = ((doingLabsHours * 60 + doingLabsMins) - (thinkingAboutShavuhaHours * 60 + thinkingAboutShavuhaMins + playingDotaHours * 60 + playingDotaMins + searchingExplictMemesHours * 60 + searchingExplictMemesMins + makingExplictMemesHours * 60 + makingExplictMemesMins)) / (realTimeOfDoinglabsHours * 60 + realTimeOfDoinglabsMins);
        double finalCountMissed = (((doingLabsHours * 60 + doingLabsMins) - (thinkingAboutShavuhaHours * 60 + thinkingAboutShavuhaMins + playingDotaHours * 60 + playingDotaMins + searchingExplictMemesHours * 60 + searchingExplictMemesMins + makingExplictMemesHours * 60 + makingExplictMemesMins)) % (realTimeOfDoinglabsHours * 60 + realTimeOfDoinglabsMins)) / (double) (realTimeOfDoinglabsHours * 60 + realTimeOfDoinglabsMins) * 100;
        if (finalCountMissed != 0) {
            switch (finalCount) {
                case 0:
                    System.out.printf("Этот ленивый дотер не сделал всего %.0f%% одной лабы!!!", finalCountMissed);
                    break;
                case 1:
                    System.out.printf("Этот ленивый дотер сделал всего 1 лабу и %.0f%% второй за %d часов и %d минут!!!", finalCountMissed, doingLabsHours, doingLabsMins);
                    break;
                case 2, 3, 4:
                    System.out.printf("Этот лентяй сделал %d лабы и %.0f%% еще одной за %d часов и %d минут!!!", finalCount, doingLabsHours, doingLabsMins);
                    break;
                default:
                    System.out.printf("Этот гений программирования претендует на автомат ведь он сделал %d лаб и %.0f%% еще одной", finalCount, finalCountMissed);
                    break;
            }
        } else {
            switch (finalCount) {
                case 0:
                    System.out.println("Этот ленивый дотер не сделал ни одной лабы!!!");
                    break;
                case 1:
                    System.out.printf("Этот ленивый дотер сделал всего 1 лабу за %d час и %d минут!!!", doingLabsHours, doingLabsMins);
                    break;
                case 2, 3, 4:
                    System.out.printf("Этот лентяй сделал %d лабы за %d часа и %d минут!!!", finalCount, doingLabsHours, doingLabsMins);
                    break;
                default:
                    System.out.printf("Этот гений программирования претендует на автомат ведь он сделал %d лаб", finalCount);
                    break;
            }
        }
    }

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
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час\n", hours);
                        break;
                    case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минут\n", hours, minutes);
                        break;
                    case 21, 31, 41, 51:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуту\n", hours, minutes);
                        break;
                    case 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d час и %d минуты\n", hours, minutes);
                        break;
                }
            }
            if (hours == 2 | hours == 3 | hours == 4 | hours == 22 | hours == 23 | hours == 24) {
                switch (minutes) {
                    case 0:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа\n", hours);
                        break;
                    case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минут\n", hours, minutes);
                        break;
                    case 21, 31, 41, 51:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуту\n", hours, minutes);
                        break;
                    case 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часа и %d минуты\n", hours, minutes);
                        break;
                }
            }
            if (hours == 0 | hours >= 5 & hours <= 20) {
                switch (minutes) {
                    case 0:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов\n", hours);
                        break;
                    case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минут\n", hours, minutes);
                        break;
                    case 21, 31, 41, 51:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуту\n", hours, minutes);
                        break;
                    case 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                        System.out.printf("Даня пытался заварить доширак и сделать из него гитару %d часов и %d минуты\n", hours, minutes);
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
        System.out.println("Расстояние между кораблями равно " + answer);
    }

    public static void menu() {
        System.out.println("Введите команду для выполнения:");
        if (command != "skip") {
            scanner.nextLine();
        }
        command = scanner.nextLine();
        if (command.equals("11")) {
            task11();
        } else if (command.equals("20")) {
            task20();
        } else if (command.equals("22")) {
            task22();
        } else if (command.equals("23")) {
            task23();
        } else if (command.equals("/exit")) {
            System.exit(228);
        } else if ((command.equals("/help"))) {
            System.out.println("Доступные команды:\n11 - задача №11\n20 - задача №20\n22 - задача №22\n23 - задача №23\n/exit - для выхода");
            command = "skip";
        } else {
            System.out.println("Введите корректное значение!");
            command = "skip";
        }
        menu();
    }

    public static void main(String[] args) {
        System.out.println("Введите /help для просмотра списка доступных команд");
        menu();
    }

}