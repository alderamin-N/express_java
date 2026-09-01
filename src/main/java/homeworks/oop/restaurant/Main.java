package homeworks.oop.restaurant;
/*
3. Управление рестораном
Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.

1 шаг понять задачу
ресторан
одно блюдо
харатеристика блюда

блюдо
тип блюда
горячее блюдо - температура
напиток - объем

2 шаг пример использования
ресторан - меню блюд - одно блюдо - его характеристика

3 шаг классы связи сущности
menu - private dish
add dish
showCharacteristic

abstract dish
abstract getDescription

hotDish extends dish
temperature
getDescription

drink extends dish
volume
getDescription

4 шаг реализация программы

 */
public class Main {
    public static void main(String[] args){
        Menu menu1 = new Menu();
        Drink latte = new Drink(250);
        menu1.addDish(latte);
        menu1.showCharacteristic();
        HotDish kasha = new HotDish(80);
        menu1.addDish(kasha);
        menu1.showCharacteristic();

    }
}
