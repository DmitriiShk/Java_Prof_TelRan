package Homework.November.HW_141124.Task1_RandomeJoke;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

   public static void main(String[] args) {

       // Исходный список анекдотов
       List<String> jokes = Arrays.asList(
          "- Напиши хороший код, и ты будешь нужен фирме пару дней.\n- Напиши плохой код, " +
             "и ты будешь нужен фирме всю жизнь.",
          "– Как поднять настроение программисту?\n– Умножить его настроение на 2.",
          "Учитель информатики сказал, что я ничего не достигну. Ну вот, написал на это программу!",
          "Почему программисты любят зиму? Потому что она начинается с нуля.",
          "Ошибка - это не ошибка, а дополнительная функция, о которой вы не знали!"
       );

       // Создаем Supplier
       Supplier<String> randomJoke = () -> {
                Random random = new Random();
                return jokes.get(random.nextInt(jokes.size()));
            };

       // Используем Supplier
       System.out.println("Ваш случайный анекдот: ");
       System.out.println(randomJoke.get());

   }

}

