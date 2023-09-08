package Lesson2;

public class Main {
    public static void main(String[] args) {
        // По заданию с прямоуголником
        Rectangle rectangle = new Rectangle();
        int perimeter = rectangle.calculatePerimeter(MathOperations.HEIGHT, MathOperations.WIDTH);
        System.out.println(perimeter);
        int area = rectangle.calculateArea(MathOperations.HEIGHT, MathOperations.WIDTH);
        System.out.println(area);
        // По заданию с хозяином и котом
        Owner owner1 = new Owner("Василий", 32, "Пушок");
        Cat cat1 = new Cat("Пушок", 5, "Василий", 32);
        owner1.sayHello();
        owner1.introduceYourself();
        owner1.tellTheAge();
        owner1.introduceFriend();

        cat1.sayHello();
        cat1.introduceYourself();
        cat1.tellTheAge();
        cat1.introduceFriend();
    }
}
