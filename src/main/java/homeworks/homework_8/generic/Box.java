package homeworks.homework_8.generic;
/*
1. Задача на дженерик класс:
Определите класс с использованием дженерик типа <T>.
В классе Box реализуйте методы set(T item) и get(), которые позволяют устанавливать и получать объект типа T.
Для хранения объекта используйте переменную экземпляра типа T.
 */
public class Box <T>{
    private T element;

    public T getElement(){
        return this.element;
    }

    public void setElement(T element){
        this.element = element;
    }

}
