
package com.itproger;

// Основний клас Auto17
class Auto17 {

    String model;

    // Вкладений клас Engine17
    class Engine17 {

        private boolean working = false;

        public void work() {
            working = true;
            System.out.println("Двигун запущено!");
        }
    }

    // Створення об'єкта вкладеного класу
    Engine17 en = new Engine17();

    // Звичайний метод
    public void move() {
        System.out.println("Автомобіль рухається");
    }
}

public class video_17 {

    public static void main(String[] args) {

        // Створення об'єкта автомобіля
        Auto17 bmw = new Auto17();

        // Виклик методу вкладеного класу
        bmw.en.work();

        System.out.println();

        // Створення анонімного класу
        Auto17 car = new Auto17() {

            @Override
            public void move() {
                System.out.println("Анонімний клас: автомобіль рухається!");
            }
        };

        // Виклик перевизначеного методу
        car.move();
    }
}
