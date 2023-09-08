package Lesson1;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Cat cat = new Cat("Снежок", 5, "Василий");
        cat.makeSound();
        //Задание 2
       Rectangle rectangle = new Rectangle(5,3);
       rectangle.calculateArea();
       rectangle.calculatePerimeter();
    }
}