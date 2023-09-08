package Lesson2;

public interface MathOperations {
    // Константы
    int HEIGHT = 10;
    int WIDTH = 5;
    // Методы
    int calculatePerimeter(int HEIGHT, int WIDTH);
    default int calculateArea(int HEIGHT,int WIDTH){
        return HEIGHT*WIDTH;
    }
}
