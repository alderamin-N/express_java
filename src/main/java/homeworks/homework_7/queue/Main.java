package homeworks.homework_7.queue;
/*
PriorityQueue

Задача 1:
Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.


ArrayDeque (хотя бы 1 любая задача)

Задача 1:
Создайте ArrayDeque, добавьте 5 элементов и выведите их.

Задача 2:
Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

Задача 3:
Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
 */

import java.util.*;

public class Main {
    static void main(String[] args) {
        //Queue
        //task 1
        Queue<Integer> task1 = new PriorityQueue<>();
        Collections.addAll(task1, 1, 23, 4, 5, 6, 45, 43);
        task1.add(3);

        while (!task1.isEmpty()) {
            System.out.println(task1.poll());
        }

        //Deque
        //task 1
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(3);
        deque.add(5);
        deque.add(6);
        deque.add(7);
        System.out.println(deque);

        //task 2
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(34);
        stack.push(76);
        stack.push(5);

        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        //task 3
        Deque<Integer> task3 = new ArrayDeque<>();
        task3.push(1);
        task3.push(2);
        System.out.println(task3);
        task3.addFirst(6);
        task3.addLast(8);
        System.out.println(task3);
        task3.pollFirst();
        task3.pollLast();
        System.out.println(task3);

    }
}
