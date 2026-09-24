package homeworks.homework_8.generic;
/*
Определите класс Pair с использованием двух дженерик типов <T, U>.
В классе Pair создайте две переменные экземпляра разных типов: T first и U second.
Реализуйте методы setFirst(T item), getFirst(), setSecond(U item) и getSecond() для работы с этими объектами.
 */
public class Pair <T,U> {
    private T first;
    private U second;

    public T getFirst(){
        return this.first;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public U getSecond(){
        return this.second;
    }

    public void setSecond(U second){
        this.second = second;
    }
}
