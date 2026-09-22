package homeworks.homework_7.set;

/*
LinkedHashSet
Задача 1:
Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

Задача 2:
Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

TreeSet
Задача 1:
Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

Задача 2:
Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.

Задача 3:
Найдите ближайшее большее и меньшее число к заданному в TreeSet.
//ближайшее большее пример, 5 - больше 5, но среди них нужно найти наименьшее
//ближайшее меньшее, пример 5 - меньше 5, но среди них нужно найти наибольшее

 */

import java.util.*;

public class Main {
    static void main(String[] args) {
        //LinkedHashSet
        //task 1
        Set<String> task1 = new LinkedHashSet<>();
        task1.add("1");
        task1.add("2");
        task1.add("3");
        task1.add("4");
        task1.add("5");

        System.out.println(task1);

        //task 2
        LinkedHashSet<String> task2 = new LinkedHashSet<>();
        addElement(task2, "Один");
        System.out.println(task2);

        //TreeSet
        //task 1
        Set<Integer> taskTreeSet = new TreeSet<>();
        taskTreeSet.add(1);
        taskTreeSet.add(2);
        taskTreeSet.add(3);
        taskTreeSet.add(5);
        taskTreeSet.add(5);
        System.out.println(taskTreeSet);

        //task 2
        TreeSet<Integer> task2TreeSet = new TreeSet<>();
        addElementTreeSet(task2TreeSet, 1);
        addElementTreeSet(task2TreeSet, 2);
        addElementTreeSet(task2TreeSet, 2);
        System.out.println(task2TreeSet);

        //task 3
        TreeSet<Integer> task3TreeSet = new TreeSet<>();
        Collections.addAll(task3TreeSet, 1, 3, 4, 2, 5, 16, 7, 8);

        int findElement = 5;
        System.out.println(task3TreeSet.higher(findElement) + " " + task3TreeSet.lower(findElement));

    }

    public static void addElement(LinkedHashSet<String> linkedHashSet, String element) {
        if (!linkedHashSet.contains(element)) {
            linkedHashSet.add(element);
        }
    }


    public static void addElementTreeSet(TreeSet<Integer> treeSet, int element) {
        if (!treeSet.contains(element)) {
            treeSet.add(element);
        }
    }

}
