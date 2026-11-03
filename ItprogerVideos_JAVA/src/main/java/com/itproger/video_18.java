
package com.itproger;

import java.util.ArrayList;

// Клас для демонстрації перевантаження та static
class Calculator18 {

    // Статична змінна
    static int count = 0;

    // Конструктор
    Calculator18() {
        count++;
    }

    // Метод для додавання цілих чисел
    public int sum(int a, int b) {
        return a + b;
    }

    // Перевантажений метод для додавання дробових чисел
    public double sum(double a, double b) {
        return a + b;
    }

    // Перевантажений метод для трьох чисел
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Статичний метод
    public static void showCount() {
        System.out.println("Кількість об'єктів: " + count);
    }
}

public class video_18 {

    public static void main(String[] args) {

        // Створення об'єктів
        Calculator18 calc1 = new Calculator18();
        Calculator18 calc2 = new Calculator18();

        System.out.println("Перевантаження методів:");
        System.out.println("------------------------");

        // Виклик різних версій методу sum()
        System.out.println("Сума двох цілих чисел: "
                + calc1.sum(5, 10));

        System.out.println("Сума дробових чисел: "
                + calc1.sum(2.5, 3.7));

        System.out.println("Сума трьох чисел: "
                + calc1.sum(5, 10, 15));

        System.out.println();

        // Використання static
        System.out.println("Використання static:");
        Calculator18.showCount();

        System.out.println();

        // Використання ArrayList з пакету java.util
        ArrayList<String> names = new ArrayList<>();

        names.add("Raisa");
        names.add("Anna");
        names.add("Ivan");

        System.out.println("Список імен:");
        System.out.println(names);
    }
}
