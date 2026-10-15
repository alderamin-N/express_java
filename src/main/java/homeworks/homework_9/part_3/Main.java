package homeworks.homework_9.part_3;

import java.util.List;

/*
1. Поиск максимального элемента
Задача: Напишите программу,
которая принимает список чисел и находит в нём самое большое число, используя Stream API.

2. Поиск минимального элемента
Задача: Напишите программу, которая принимает список чисел
 и находит в нем наименьшее число, используя Stream API.

3. Сумма всех элементов списка
Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму,
используя Stream API.

4. Поиск первого элемента, начинающегося на "Б"
Задача: Напишите программу, которая принимает список строк и находит первую строку,
начинающуюся на букву "Б", используя Stream API.

5. Проверка наличия хотя бы одного элемента по условию
Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
 который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
 */
public class Main {

    static void main() {

        //task 1
        List<Integer> numbers = List.of(1,2,45,67,87,4,6);
        int num1 = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println(num1);

        //task 2
        int num2 = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println(num2);

        //task 3 - 1 вариант
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //task 3 - 2 вариант
        int sum2 = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(sum2);

        //task 4
        List<String> list = List.of("Алла", "Магазин", "Борис", "Бабочка");
        String word = list.stream().filter(e -> e.startsWith("Б")).findFirst().orElse(" ");
        System.out.println(word);

        //task 5
        boolean result = numbers.stream().anyMatch(e -> e % 2 == 0);
        System.out.println(result);

    }
}
