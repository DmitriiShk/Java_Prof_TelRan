package Extra.Test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DoctorQueue {

    // Коллекция для хранения записи пациентов на приём
    private static TreeMap<Integer, String> appointmentSchedule = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // Информация о доступных слотах
        System.out.println("Доступные слоты для бронирования: 1 - 9:00, 2 - 9:30, 3 - 10:00 и т.д.");

        while (isRunning) {
            showMenu();
            int choice = readInt(scanner, "Введите номер действия: ");

            if (choice == 1) {
                handleBooking(scanner);
            } else if (choice == 2) {
                printSchedule();
            } else if (choice == 3) {
                isRunning = false;
                System.out.println("Выход из программы. Хорошего дня!");
            } else {
                System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    // Печатает меню
    private static void showMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Забронировать слот");
        System.out.println("2. Показать очередь пациентов");
        System.out.println("3. Выйти");
    }

    // Обрабатывает бронирование слота
    private static void handleBooking(Scanner scanner) {
        int slot = readInt(scanner, "Введите номер слота (например, 1 для 9:00): ");

        if (appointmentSchedule.containsKey(slot)) {
            System.out.println("Этот временной слот уже занят. Выберите другой.");
            return;
        }

        System.out.print("Введите имя пациента: ");
        String patientName = scanner.nextLine();

        appointmentSchedule.put(slot, patientName);
        System.out.println("Слот успешно забронирован для " + patientName);
    }

    // Печатает расписание
    private static void printSchedule() {
        if (appointmentSchedule.isEmpty()) {
            System.out.println("Нет записанных пациентов.");
            return;
        }

        System.out.println("Очередь пациентов по времени:");
        for (Map.Entry<Integer, String> entry : appointmentSchedule.entrySet()) {
            int slot = entry.getKey();
            String patientName = entry.getValue();
            System.out.println("Слот " + slot + ": " + patientName);
        }
    }

    // Читает целое число с проверкой ввода
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка ввода! Введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }
    }
}
