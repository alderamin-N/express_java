package homeworks.homework_8.exception;

/*
Задачи на исключения

1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".

2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.

3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.

4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям,
функция должна выбрасывать непроверяемое исключение.
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //task 1
        try {
            FileReader fileReader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        //проверка task 2
        divideByZero(5, 0);

        //проверка task 3
        try {
            checkAge(-8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        //проверка task 4
        checkMail("kus@mail.co");

    }

    //task 2
    public static void divideByZero(int a, int b) { //изменила на divide наименование метода
        try {
            double result = ((double)a / b); // привела к double делимое
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }
    }

    //task 3
    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст меньше 0 или больше 150");
        } else {
            System.out.println("Возраст корректный");
        }
    }

    //task 4
    public static void checkMail(String email) {
        Pattern pattern = Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$"); //изменила регулярное выражение
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email корректный");
        } else {
            throw new InvalidEmailException("Некорректный формат email");
        }
    }


}
