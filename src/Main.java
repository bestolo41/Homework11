import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2014;
        String clientOS = "iOS";
        int clientDeviceYear = 2022;
        int deliveryDistance = 40;
        calculatesLeapYear(year);
        installationLink(clientOS, clientDeviceYear);
        deliveryTime(deliveryDistance);
    }
    public static void calculatesLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d год является високосным", year);
        } else if (year % 400 == 0) {
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }
    }

    public static void installationLink(String clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == "iOS") {
            System.out.println("Укажите год выпуска вашего девайса:");
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == "Android") {
            System.out.println("Укажите год выпуска вашего девайса:");
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректный ответ. Попробуйте снова");
        }
    }

    public static void deliveryTime(int deliveryDistance) {

        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            deliveryTime = ((deliveryDistance - 20) / 40) * deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}