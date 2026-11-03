
package com.itproger;

// Батьківський абстрактний клас
abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Отримання імені
    public String getName() {
        return name;
    }

    // Абстрактний метод
    public abstract void makeSound();
}

// Дочірній клас Dog
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорить: Гав-гав!");
    }
}

// Дочірній клас Cat
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорить: Няв!");
    }
}

public class video_11 {

    public static void main(String[] args) {

        // Створення об'єктів
        Dog dog = new Dog("Бобік");
        Cat cat = new Cat("Мурчик");

        System.out.println("Основи ООП у Java");
        System.out.println("----------------");

        // Виклик методів
        dog.makeSound();
        cat.makeSound();

        // Поліморфізм
        Animal[] animals = {dog, cat};

        System.out.println("\nПоліморфізм:");

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
