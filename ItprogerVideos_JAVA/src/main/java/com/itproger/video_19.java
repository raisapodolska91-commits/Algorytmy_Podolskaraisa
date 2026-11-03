
package com.itproger;

// Створення першого інтерфейсу
interface SomeOne19 {

    void Change(String val);
}

// Створення другого інтерфейсу
interface Activity19 {

    void showInfo();
}

// Клас Person19 реалізує два інтерфейси
class Person19 implements SomeOne19, Activity19 {

    String name;
    float happiness;
    int age;

    // Конструктор
    Person19(String name, float happiness, int age) {
        this.name = name;
        this.happiness = happiness;
        this.age = age;
    }

    // Реалізація першого інтерфейсу
    @Override
    public void Change(String val) {
        this.name = val;
        System.out.println("Тепер людину звуть - " + val);
    }

    // Реалізація другого інтерфейсу
    @Override
    public void showInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Рівень щастя: " + happiness);
    }
}

public class video_19 {

    public static void main(String[] args) {

        // Створення об'єкта
        Person19 person = new Person19("Іван", 8.5f, 20);

        System.out.println("Початкова інформація:");
        person.showInfo();

        System.out.println();

        // Зміна імені
        person.Change("Олександр");

        System.out.println();

        // Виведення оновленої інформації
        System.out.println("Оновлена інформація:");
        person.showInfo();
    }
}
