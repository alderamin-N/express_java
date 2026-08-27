package practice.oop.practice_5.task_3;
/*
    Ваша задача спроектировать систему которая управляет заказом с товарами и скидками

    ШАГ 1. ЗАФИКСИРОВАТЬ УСЛОВИЕ
    Два типа товаров:
    Digital Product(fileSize field)
    Phisycal Product(weight field)

    Два типа скидок:
    Percentage Discount (perentage)
    Fixed Discount (fixSum)

    ШАГ 2. ПРИМЕР ИСПОЛЬЗОВАНИЯ

    Создать заказ1
    Положить в заказ1 товар1
    Положить в заказ1 [товар2, товар3]
    Применить скидку в 20% к заказу1
    Применить скидку в 10$ к заказу1
    Посчитать сумму к оплате заказа1



    Вопросы:
    1) В заказе может быть несколько товаров?  - да
    2) Как мы добавляем товары в заказ по одному или несколько? - и так и так
    3) Скидка применяется к товару или к заказу? - к заказу
    4) Можем ли мы применять несколько скидок к заказу? - да
    5) Считаем ли мы общую сумму в заказе? - да
    6) Какие свойства у любого товара? - цена, название

    ШАГ 3: ПРОЕКТИРОВАНИЕ КЛАССОВ И СВЯЗЕЙ

    1) сущности, свойства, связи

    - Product (price, title) - сущность маркер
    - DigitalProduct (fileSize) extends Product
    - PhysicalProduct (weight) extends Product

    - Discountable - (method discount())
    - PercentageDiscount(percentage) implements Discountable, переопределение discount()
    - FixedDiscount(fixSum) implements Discountable, переопределение discount()

    - Order (содержит products, содержит discounts) - композиция
    - method calculateTotalPrice()

    ШАГ 4: РЕАЛИЗАЦИЯ ПРОГРАММЫ
    Наследования - наследование
    Полиморфизм - интерфейс
    Композиция - поля
    Структура данных - JCF (быстрое получение доступа - массив, добавление/удаление - список)


    ШАГ 5: ПОДВЕДЕНИЕ ИТОГОВ РЕАЛИЗАЦИИ И ПРЕДЛОЖЕНИЕ ПО БУДУЩЕМУ УЛУЧШЕНИЮ

 */

import java.util.List;

public class Main {

    static void main(String[] args) {
        /*
        Создать заказ1
        Положить в заказ1 товар1
        Положить в заказ1 [товар2, товар3]
        Применить скидку в 20% к заказу1
        Применить скидку в 10$ к заказу1
        Посчитать сумму к оплате заказа1
        */

        Order order = new Order();
        order.addProduct(new DigitalProduct("Лекция", 30,30));
        order.addProducts(List.of(new PysicalProduct("Apple", 10, 100),
                new DigitalProduct("Sing", 5,3)));
        order.addDiscout(new PercentageDiscount(20));
        order.addDiscout(new FixedDiscount(10));
        System.out.println(order.calculatePrice());
    }
}
