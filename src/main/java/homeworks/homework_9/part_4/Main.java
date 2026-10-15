package homeworks.homework_9.part_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
1. Группировка строк по первой букве
Задача: Напишите программу, которая принимает список строк и группирует
 их по первой букве, используя Stream API.

2. Группировка чисел по чётности
Задача: Напишите программу, которая принимает список чисел и группирует
 их на чётные и нечётные, используя Stream API.

3. Поиск среднего значения чисел
Задача: Напишите программу, которая принимает список чисел и находит
 их среднее значение, используя Stream API.
 */
public class Main {
    static void main() {

        //task 1
        List<String> list = List.of("Алла", "Борис", "Алмаз", "Бабочка", "Праздник");
        Map<Character, List<String>> result = list.stream().
                collect(Collectors.groupingBy(e -> e.charAt(0)));
        System.out.println(result);

        //task 2
        List<Integer> numbers = List.of(1,2,34,5,67,5,6,7);
        Map<Boolean, List<Integer>> result2 = numbers.stream().
                collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println(result2);

        //task 3
        double result3 = numbers.stream().collect(Collectors.averagingDouble(value -> value));
        System.out.println(result3);
    }
}
