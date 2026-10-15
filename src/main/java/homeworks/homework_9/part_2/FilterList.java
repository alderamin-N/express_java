package homeworks.homework_9.part_2;

import java.util.List;
import java.util.stream.Collectors;

/*
1. Фильтрация строк по длине больше 5
Задача: Напишите программу, которая принимает список
строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.

2. Фильтрация чисел, кратных 5
Задача: Напишите программу, которая принимает список
 чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
 */
public class FilterList {
    static void main() {

        List<String> words = List.of("январь", "февраль", "март", "апрель", "май");
        List<String> result = words.stream().
                filter(str -> str.length() > 5).
                collect(Collectors.toList());
        System.out.println(result);

        List<Integer> numbers = List.of(1,2,3,5,15,20,25);
        List<Integer> result2 = numbers.stream().
                filter(n -> n % 5 == 0).
                collect(Collectors.toList());
        System.out.println(result2);
    }
}
