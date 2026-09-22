package homeworks.homework_7.linkedlist;

/*
Задача 1:
Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

Задача 2:
Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

Задача 3:
Создайте LinkedList, содержащий несколько строк.
Напишите программу, которая печатает первый и последний элементы списка.

Задача 4:
Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.

Задача 5:
Используйте ListIterator для прохода по LinkedList в обоих направлениях.
 */

import practice.practice_8.library.Library;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static void main(String[] args) {

        //task 1
        //вариант 1
        List<String> task1 = new LinkedList<>();
        task1.add("Первый");
        task1.add("Второй");
        task1.add("Третий");
        task1.add("Четвертый");
        task1.add("Пятый");

        System.out.println(task1);

        //вариант 2
        List<String> task12 = new LinkedList<>();
        Collections.addAll(task12, "1", "2", "3", "4", "5");
        System.out.println(task12);

        //task 2
        Queue<String> task2 = new LinkedList<>();
        task2.add("Task 1");
        task2.add("Task 2");
        task2.add("Task 3");
        task2.add("Task 4");

        while (!task2.isEmpty()) {
            System.out.println(task2.poll());
        }

        //task 3
        List<String> task3 = new LinkedList<>();
        Collections.addAll(task3, "1", "No", "Tree", "5");
        System.out.println(task3.getFirst() + " " + task3.getLast());

        //task 4
        List<Integer> task4 = new LinkedList<>();
        Collections.addAll(task4, 1, 2, 3, 4, 5);

        int sum = 0;
        for (Integer element : task4) {
            sum += element;
        }

        System.out.println(sum);

        //task 5
        List<Integer> task5 = new LinkedList<>();
        Collections.addAll(task5, 1, 2, 3, 4, 5);

        ListIterator<Integer> interator = task5.listIterator();

        while (interator.hasNext()) {
            System.out.println(interator.next());
        }

        while (interator.hasPrevious()) {
            System.out.println(interator.previous());
        }


    }
}
