import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2014;
        String clientOS = "iOS";
        int clientDeviceYear = 2022;
        int deliveryDistance = 40;
        calculatesLeapYear(year);
        installationLink(clientOS, clientDeviceYear);
        System.out.println("Дней доставки: " + deliveryTime(deliveryDistance));
    }
    private static void calculatesLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void installationLink(String clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == "iOS") {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == "Android") {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректный ответ. Попробуйте снова");
        }
    }

    private static int deliveryTime(int deliveryDistance) {

        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            return deliveryTime;
        } else {
            deliveryTime = ((deliveryDistance - 20) / 40) * deliveryTime + 2;
            return deliveryTime;
        }
    }
}