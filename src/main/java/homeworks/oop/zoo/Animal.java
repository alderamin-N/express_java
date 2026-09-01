package homeworks.oop.zoo;

public abstract class Animal {
    abstract void makeSound();
    abstract void makeMove();

    @Override
    public String toString() {
        return "Животное";
    }
}
