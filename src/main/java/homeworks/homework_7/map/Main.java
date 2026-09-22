package homeworks.homework_7.map;
/*
HashMap (хотя бы 2 любые задачи)

Задача 1:
Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.

Задача 2:
Проверьте, есть ли определённое имя в HashMap.

Задача 3:
Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.


LinkedHashMap (хотя бы 1 любая задача)

Задача 1:
Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.

Задача 2:
Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.


TreeMap (хотя бы 1 любая задача)

Задача 1:
Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

Задача 2:
Найдите минимальный и максимальный ключ в TreeMap.

Задача 3:
Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static void main(String[] args) {
        //HashMap
        //task 1
        Map<String, Integer> task1HashMap = new HashMap<>();
        task1HashMap.put("Маша", 23);
        task1HashMap.put("Саша", 23);
        task1HashMap.put("Паша", 45);
        task1HashMap.put("Толя", 76);
        task1HashMap.put("Коля", 37);
        System.out.println(task1HashMap);

        //task 2
        String findName = "Вася";
        if (task1HashMap.containsKey(findName)) {
            System.out.println("Имя найдено " + findName);
        } else {
            System.out.println("Имя не найдено");
        }


        //task 3
        HashMap<String, Integer> task3HashMap = new HashMap<>();
        task3HashMap.put("Маша", 23);
        task3HashMap.put("Саша", 13);
        task3HashMap.put("Паша", 45);
        task3HashMap.put("Толя", 76);
        task3HashMap.put("Коля", 37);
        findEntry(task3HashMap);

        //LinkedHashMap
        //task 1
        Map<Integer, String> task1LinkedHashMap = new LinkedHashMap<>();
        task1LinkedHashMap.put(1, "Петя");
        task1LinkedHashMap.put(2, "Вова");
        task1LinkedHashMap.put(3, "Митя");
        task1LinkedHashMap.put(4, "Катя");
        task1LinkedHashMap.put(5, "Диана");
        System.out.println(task1LinkedHashMap);

        //task 2
        Map<String, String> task2Telephone = new LinkedHashMap<>();
        task2Telephone.put("Петя", "8 909 456 67 67");
        task2Telephone.put("Диана", "8 905 426 64 67");
        task2Telephone.put("Коля", "8 906 456 67 66");
        task2Telephone.put("Маша", "8 908 456 67 87");

        String findNameTelephone = "Диана";

        if (task2Telephone.containsKey(findNameTelephone)) {
            System.out.println(findNameTelephone + " " + task2Telephone.get(findNameTelephone));
        } else {
            System.out.println("Такого контакта нет");
        }

        //TreeMap
        //task 1
        TreeMap<String, Integer> nameTreeMap = new TreeMap<>();
        nameTreeMap.put("Вася", 45);
        nameTreeMap.put("Маша", 95);
        nameTreeMap.put("Антон", 67);
        nameTreeMap.put("Алена", 35);
        nameTreeMap.put("Петр", 45);
        System.out.println(nameTreeMap);

        //task 2
        System.out.println(nameTreeMap.firstKey());
        System.out.println(nameTreeMap.lastKey());

        //task 3
        TreeMap<Integer, String> findKey = new TreeMap<>();
        findKey.put(1, "Маша");
        findKey.put(5, "Саша");
        findKey.put(8, "Толя");
        findKey.put(12, "Полина");
        findKey.put(10, "Катя");

        int findID = 5;
        System.out.println(findKey.higherKey(findID));


    }

    public static void findEntry(HashMap<String, Integer> map) {
        map.entrySet().forEach(entry -> {
            if (entry.getValue() < 18) {
                System.out.println(entry);
            }
        });

    }
}
