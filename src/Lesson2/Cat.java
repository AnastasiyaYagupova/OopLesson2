package Lesson2;

public class Cat extends Owner {
    int petAge;
    // Конструктор для кота
    public Cat(String petName,int petAge, String name,int age) {
        super(name, age, petName);
        this.petAge = petAge;
    }
    // Измененные методы из интерфейсов для кота
    @Override
    public void introduceFriend() {
        System.out.println("Мой хозяин " + this.getName());
    }

    @Override
    public void introduceYourself() {
        System.out.println("Меня зовут " + getPetName());
    }

    @Override
    public void sayHello() {
        System.out.println("Мяу! ");
    }

    @Override
    public void tellTheAge() {
        System.out.println("Мне " + petAge + ".");
    }
}
