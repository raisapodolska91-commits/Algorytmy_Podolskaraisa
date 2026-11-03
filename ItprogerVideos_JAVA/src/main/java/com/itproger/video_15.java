
package com.itproger;

// Батьківський клас
class Transport15 {

    public void move() {
        System.out.println("Транспорт рухається");
    }
}

// Дочірній клас автомобіля
class Auto15 extends Transport15 {

    @Override
    public void move() {
        System.out.println("Автомобіль їде по дорозі");
    }
}

// Дочірній клас мотоцикла
class Moto15 extends Transport15 {

    @Override
    public void move() {
        System.out.println("Мотоцикл їде по дорозі");
    }
}

public class video_15 {

    public static void main(String[] args) {

        // Створення об'єктів
        Transport15 transport = new Transport15();
        Transport15 auto = new Auto15();
        Transport15 moto = new Moto15();

        System.out.println("Приклад поліморфізму:");
        System.out.println("----------------------");

        // Виклик одного методу для різних об'єктів
        transport.move();
        auto.move();
        moto.move();
    }
}
