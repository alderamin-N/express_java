package homeworks.homework_7.hashset;
/*
Задача 1:
Создайте HashSet из 5 чисел и выведите его содержимое.

Задача 2:
Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

Задача 3:
Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

Задача 4:
Создайте HashSet, содержащий набор имен.
Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
 */


import java.util.*;

public class Main {
    static void main(String[] args) {
        //task 1
        //вариант 1
        Set<Integer> task1 = new HashSet<>();
        task1.add(1);
        task1.add(2);
        task1.add(3);
        task1.add(4);
        task1.add(5);
        System.out.println(task1);

//        //вариант 2
        Set<Integer> task12 = new HashSet<>();
        Collections.addAll(task12, 1, 2, 3, 4, 5);
        System.out.println(task12);

        //task 2
        Set<Integer> task2 = new HashSet<>();
        Collections.addAll(task2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int findNumber = 49;
        if (task2.contains(findNumber)) {
            System.out.println(findNumber);
        } else {
            System.out.println("Такого числа нет в коллекции");
        }

        //task 3
        List<String> list3 = new ArrayList<>(Arrays.asList("1", "2", "2", "3"));
        Set<String> task3 = task3(list3);
        System.out.println(task3);

        //task 4
        Set<String> task4 = new HashSet<>();
        Collections.addAll(task4, "Наташа", "Маша", "Костя", "Андрей", "Настя");
        String findName = "Наташа";
        if (task4.contains(findName)) {
            System.out.println("Ваше имя найдено " + findName);
        } else {
            System.out.println("Ваше имя не найдено");
        }

    }

    public static Set<String> task3(List<String> list) {
        Set<String> setLines = new HashSet<>();
        setLines.addAll(list);
        return setLines;
    }

}
