package Lesson2;

public class Rectangle implements MathOperations {
    @Override
    public int calculatePerimeter(int HEIGHT, int WIDTH){
        return 2*(HEIGHT+WIDTH);
    }
}
