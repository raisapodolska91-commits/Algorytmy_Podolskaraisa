
package com.itproger;

// Створення класу Book
class Book {

    public int pages;
    public String name;
    public float weight;

    // Метод для виведення інформації про книгу
    public void getInfoBook() {
        System.out.print("У книзі " + name + " знаходиться " + pages + " сторінок. ");
        System.out.print("При цьому вона важить: " + weight + " кг.");
        System.out.println();
    }
}

public class video_12 {

    public static void main(String[] args) {

        // Створення першого об'єкта
        Book sherlock_holmes = new Book();

        sherlock_holmes.pages = 250;
        sherlock_holmes.name = "Шерлок Холмс";
        sherlock_holmes.weight = 0.5f;

        // Створення другого об'єкта
        Book harry_potter = new Book();

        harry_potter.pages = 400;
        harry_potter.name = "Гаррі Поттер";
        harry_potter.weight = 0.7f;

        // Виведення інформації
        System.out.println("Інформація про книги:");
        System.out.println("--------------------");

        sherlock_holmes.getInfoBook();
        harry_potter.getInfoBook();
    }
}
