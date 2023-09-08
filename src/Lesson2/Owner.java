package Lesson2;

public class Owner implements IntroduceFriend {
    private String name;
    private int age;
    private String petName;
    // Конструктор для хозяина
    public Owner(String name, int age, String petName) {
        this.name = name;
        this.age = age;
        this.petName = petName;
    }
    // Сетторы и гетторы
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPetName() {
        return petName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
    // Измененные методы из интерфейсов для хозяина
    @Override
    public void introduceFriend() {
        System.out.println("Мой питомец " + this.petName);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Меня зовут " + this.name);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравствуйте! ");
    }

    @Override
    public void tellTheAge() {
        System.out.println("Мне " + this.age + ".");
    }
}
