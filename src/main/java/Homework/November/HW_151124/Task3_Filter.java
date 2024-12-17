package Homework.November.HW_151124;

import java.util.List;
import java.util.ArrayList;

// 1. Интерфейс Filter
interface Filter {
    boolean apply(String data);
}

public class Task3_Filter {

    public static List<String> filterList(List<String> data, Filter filter) {
        List<String> filteredList = new ArrayList<>();

        // Перебираем каждый элемент списка и проверяем условие фильтрации
        for (String item : data) {
            if (filter.apply(item)) {  // Если фильтр разрешает данный элемент
                filteredList.add(item);  // Добавляем его в новый список
            }
        }

        return filteredList;  // Возвращаем отфильтрованный список
    }

    public static void main(String[] args) {
        // Пример использования метода filterList

        // Список строк
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("fig");

        // Пример фильтрации: фильтруем строки, длина которых больше 5
        List<String> filteredStrings = filterList(strings, (String data) -> data.length() > 5);

        // Вывод отфильтрованных данных
        System.out.println(filteredStrings);  // [banana, cherry]
    }
}
