
package com.itproger;

// Батьківський клас
class Transport14 {

    protected float speed;
}

// Дочірній клас
class Auto14 extends Transport14 {

    private String model;

    // Конструктор
    Auto14(float speed, String model) {
        this.speed = speed;
        this.model = model;

        System.out.println("Швидкість: " + speed
                + ", модель - " + model);
    }
}

public class video_14 {

    public static void main(String[] args) {

        // Створення першого об'єкта
        Auto14 bmw = new Auto14(250.5f, "X3M");

        // Створення другого об'єкта
        Auto14 mercedes = new Auto14(270f, "C63 AMG");

    }
}
