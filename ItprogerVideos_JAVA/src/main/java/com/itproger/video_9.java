
package com.itproger;

import java.util.ArrayList;
import java.util.LinkedList;

public class video_9 {

    public static void main(String[] args) {

        // Створення ArrayList
        ArrayList<Float> numbers = new ArrayList<>();

        numbers.add(2.5f);
        numbers.add(4.7f);
        numbers.add(6.3f);
        numbers.add(8.1f);

        System.out.println("ArrayList:");
        System.out.println(numbers);

        // Отримання елемента
        System.out.println("Елемент за індексом 1: " + numbers.get(1));

        // Зміна елемента
        numbers.set(1, 5.2f);
        System.out.println("Після зміни: " + numbers);

        // Видалення елемента
        numbers.remove(0);
        System.out.println("Після видалення: " + numbers);

        // Кількість елементів
        System.out.println("Кількість елементів: " + numbers.size());


        // Створення LinkedList
        LinkedList<String> names = new LinkedList<>();

        names.add("Raisa");
        names.add("Anna");
        names.add("Ivan");

        System.out.println("\nLinkedList:");
        System.out.println(names);

        // Додавання елементів
        names.addFirst("Maria");
        names.addLast("Oleh");

        System.out.println("Після додавання: " + names);

        // Отримання першого та останнього елементів
        System.out.println("Перший елемент: " + names.getFirst());
        System.out.println("Останній елемент: " + names.getLast());

        // Видалення елементів
        names.removeFirst();
        names.removeLast();

        System.out.println("Після видалення: " + names);

        // Очищення списку
        names.clear();

        System.out.println("Після очищення: " + names);
    }
}
