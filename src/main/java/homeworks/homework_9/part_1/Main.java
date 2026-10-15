package homeworks.homework_9.part_1;
/*
Часть 1: Функциональные интерфейсы и лямбда-выражения
1. Создайте свой функциональный интерфейс
Задача: Напишите интерфейс MathOperation, который принимает
два числа и возвращает результат операции.
Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

2. Использование анонимного класса
Задача: Создайте анонимный класс, реализующий интерфейс Runnable,
который выводит сообщение "Hello from anonymous class!".

3. Лямбда-выражение с Predicate
Задача: Напишите лямбду, которая проверяет, является ли число чётным.

4. Лямбда-выражение с Function
Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

5. Использование Consumer
Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.

 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){
        //task 1
        MathOperation add = (x,y) -> x + y;
        MathOperation subtration = (x,y) -> x - y;
        MathOperation multiply = (x, y) -> x * y;
        MathOperation divide = (x, y) -> x / y;

        System.out.println(add.mathOperation(2,4));
        System.out.println(subtration.mathOperation(7,4));
        System.out.println(multiply.mathOperation(2,4));
        System.out.println(divide.mathOperation(20,4));


        //task 2 - анонимный класс
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();

        //task 3
        Predicate<Integer> checkNumber = (a) -> a % 2 == 0;
        System.out.println(checkNumber.test(4));
        System.out.println(checkNumber.test(5));

        //task 4
        Function<String, Integer> count = (str) -> str.length();
        System.out.println(count.apply("Это строка 1"));

        //task 5
        Consumer<String> print = System.out::println;
        print.accept("Hello");
    }
}
