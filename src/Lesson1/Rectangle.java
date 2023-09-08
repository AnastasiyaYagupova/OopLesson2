package Lesson1;

public class Rectangle {
    private double width;
    private double height;

    //Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
    public Rectangle() {
        this.width = width;
        this.height = height;
    }

    //Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
    }

    //Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
    public void calculateArea(){
        System.out.println(height * width);
    }
    //Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
    public void calculatePerimeter(){
        System.out.println(2* (height + width));
    }
}
