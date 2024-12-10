package Homework.November.HW_071124.Task3_Route;

import java.util.HashMap;

    /*
    Составить маршрут из заданного списка билетов
    Имеется перемешанный список билетов. Необходимо найти маршрут, восстановив порядок билетов.
    Вход:
    «Berlin» -> «London»
    «Tokyo» -> «Seoul»
    «Mumbai» -> «Berlin»
    «Seoul» -> «Mumbai»

    Выход:
    Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London
     */

public class RouteFinder {
    public static void main(String[] args) {

        // Входные данные: билеты в виде маршрутов
        String[][] tickets = {
                {"Berlin", "London"},
                {"Tokyo", "Seoul"},
                {"Mumbai", "Berlin"},
                {"Seoul", "Mumbai"}
        };

        // Создаем карту маршрутов
        HashMap<String, String> routeMap = new HashMap<>();
        for (String[] ticket : tickets) {
            routeMap.put(ticket[0], ticket[1]);
        }

        // Находим начальный город, который не является пунктом назначения
        String start = findStartingPoint(routeMap);

        // Восстанавливаем маршрут от стартовой точки
        StringBuilder result = new StringBuilder();
        String current = start;
        while (current != null) {
            result.append(current);
            String next = routeMap.get(current);
            if (next != null) {
                result.append(" -> ").append(next);
            }
            current = next;
        }

        // Вывод результата
        System.out.println(result.toString());
    }

    // Метод для поиска начального города
    private static String findStartingPoint(HashMap<String, String> map) {
        // Создаем множество всех пунктов назначения
        HashMap<String, Boolean> destinations = new HashMap<>();
        for (String destination : map.values()) {
            destinations.put(destination, true);
        }

        // Проверяем каждый пункт отправления: если он не в списке пунктов назначения, это начальная точка
        for (String start : map.keySet()) {
            if (!destinations.containsKey(start)) {
                return start;
            }
        }

        return null; // Не найдено начальной точки, но в корректном вводе это не должно происходить
    }
}


