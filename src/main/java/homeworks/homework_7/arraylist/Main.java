package homeworks.homework_7.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
ArrayList (хотя бы 2 любые задачи)

Задача 1:
Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

Задача 2:
Напишите программу, которая выводит все чётные числа из ArrayList.

Задача 3:
Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

Задача 4:
Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.

Задача 5:
Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
 */
public class Main {
    public static void main(String[] args) {

        //task 1
        //1 вариант
        List<Integer> task1 = new ArrayList<>();
        task1.add(1);
        task1.add(2);
        task1.add(3);
        task1.add(4);
        task1.add(5);
        task1.add(6);
        System.out.println(task1);

//        //2 вариант
        List<Integer> task11 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        task11.add(6);
        System.out.println(task11);

        //task 2
        List<Integer> task2 = new ArrayList<>(Arrays.asList(1, 12, 3, 4, 5, 6));

        for (Integer number : task2) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        //task 3
        List<String> task3 = new ArrayList<>();
        task3.add("Перый");
        task3.add("Второй");
        task3.add("Это моя первая программа по коллекциям");

        int maxLenght = 0;
        String maxLine = "";
        for (String line : task3) {
            if (maxLenght < line.length()) {
                maxLenght = line.length();
                maxLine = line;
            }
        }

        System.out.println(maxLenght);
        System.out.println(maxLine);

        //task 4
        List<Integer> task4 = new ArrayList<>(Arrays.asList(1, 2, 3, 45, 6));
        int sum = 0;
        for (Integer element : task4) {
            sum += element;
        }

        System.out.println(sum);

        //task 5
        List<Integer> task5 = new ArrayList<>(Arrays.asList(1, 2, 3, 76));

        int maxNumber = 0;
        for (Integer element : task5) {
            if (maxNumber < element) {
                maxNumber = element;
            }
        }
        System.out.println(maxNumber);

    }

}
