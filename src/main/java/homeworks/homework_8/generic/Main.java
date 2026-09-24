package homeworks.homework_8.generic;
/*
1. Задача на дженерик класс:
Определите класс с использованием дженерик типа <T>.
В классе Box реализуйте методы set(T item) и get(), которые позволяют устанавливать и получать объект типа T.
Для хранения объекта используйте переменную экземпляра типа T.

2. Задача на дженерик метод:
Определите метод с дженерик параметром <T>.
Используйте параметр типа T[] для передачи массива в метод.
Внутри метода используйте цикл для перебора элементов массива и их вывода.

3. Задача на дженерик с двумя типами данных:
Определите класс Pair с использованием двух дженерик типов <T, U>.
В классе Pair создайте две переменные экземпляра разных типов: T first и U second.
Реализуйте методы setFirst(T item), getFirst(), setSecond(U item) и getSecond() для работы с этими объектами.
 */

public class Main {
    static void main(String[] args) {
        //проверка task 1
        Box<String> box1 = new Box<>();
        box1.setElement("First");
        box1.getElement();
        Box<Integer> box2 = new Box<>();
        box2.setElement(12);
        box2.getElement();

        //проверка task 2
        method(new String[]{"1", "2"});
        method(new Integer[]{3, 4});

        //проверка task 3
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("First");
        pair.setSecond(1);
        pair.getFirst();
        pair.getSecond();


    }

    public static <T> void method(T[] massive) {
        for (T element : massive) {
            System.out.println(element);
        }
    }
}
