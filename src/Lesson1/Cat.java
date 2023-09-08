package Lesson1;

public class Cat extends Owner {
    private String catName;
    private int CatAge;

    // Конструктор класса Cat
    public Cat(String name, int age, String ownerName) {
        super(ownerName);
        this.catName = name;
        this.CatAge = age;
    }

    // Геттер для получения имени питомца
    public String getCatName() {
        return catName;
    }

    // Сеттер для установки имени питомца
    public void setCatName(String catName) {
        this.catName = catName;
    }

    // Геттер для получения возраста питомца
    public int getCatAge() {
        return CatAge;
    }

    // Сеттер для установки возраста питомца
    public void setCatAge(int catAge) {
        if (catAge > 0) {
            this.CatAge = catAge;
        }
    }

    public void makeSound() {
        if(getCatAge() > 0 && getCatAge() < 5) {
            System.out.println("Мяу! Меня зовут " + getCatName() + ". Мне " + getCatAge() + " года." + " Мой хозяин " + getOwnerName());
        } else {
            System.out.println("Мяу! Меня зовут " + getCatName() + ". Мне " + getCatAge() + " лет."+ " Мой хозяин " + getOwnerName());
        }
    }
}
