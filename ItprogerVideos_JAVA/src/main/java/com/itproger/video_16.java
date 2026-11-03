
package com.itproger;

// Створення абстрактного класу
abstract class Animal16 {

    protected String name;

    // Конструктор
    public Animal16(String name) {
        this.name = name;
    }

    // Абстрактний метод
    public abstract void makeSound();

    // Звичайний метод
    public void getName() {
        System.out.println("Ім'я тварини: " + name);
    }
}

// Дочірній клас Dog
class Dog16 extends Animal16 {

    public Dog16(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака говорить: Гав-гав!");
    }
}

// Дочірній клас Cat
class Cat16 extends Animal16 {

    public Cat16(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Кіт говорить: Няв!");
    }
}

public class video_16 {

    public static void main(String[] args) {

        // Створення об'єктів
        Animal16 dog = new Dog16("Бобік");
        Animal16 cat = new Cat16("Мурчик");

        System.out.println("Абстрактні класи та методи");
        System.out.println("--------------------------");

        // Виклик методів
        dog.getName();
        dog.makeSound();

        System.out.println();

        cat.getName();
        cat.makeSound();
    }
}
