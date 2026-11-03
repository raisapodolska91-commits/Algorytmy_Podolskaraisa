
package com.itproger;

// Створення класу Book13
class Book13 {

    private int pages;
    private String name;
    private float weight;

    // Перший конструктор
    Book13(int pages, float weight) {
        this.pages = pages;
        this.weight = weight;
    }

    // Другий конструктор
    Book13(int pages, float weight, String name) {
        this.pages = pages;
        this.weight = weight;
        this.name = name;
    }

    // Метод для встановлення назви книги
    public void setName(String name) {
        this.name = name;
    }

    // Метод для виведення інформації
    public void getInfoBook() {
        System.out.print("У книзі " + name + " знаходиться "
                + pages + " сторінок. ");
        System.out.print("При цьому вона важить "
                + weight + " кг!");
        System.out.println();
    }
}

public class video_13 {

    public static void main(String[] args) {

        // Створення першого об'єкта
        Book13 sherlock_holms = new Book13(460, 1.7f);

        sherlock_holms.setName("Шерлок Холмс");

        // Виведення інформації
        sherlock_holms.getInfoBook();

        // Створення другого об'єкта
        Book13 green_mile = new Book13(750, 2.8f, "Зелена миля");

        // Виведення інформації
        green_mile.getInfoBook();
    }
}
