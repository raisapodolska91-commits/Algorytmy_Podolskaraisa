
package com.itproger;

public class video_10 {

    public static void main(String[] args) {

        // Виклик функції без параметрів
        test();

        System.out.println();

        // Виклик функції з параметром String
        test("Привіт, Java!");

        System.out.println();

        // Виклик функції з параметром double
        double result = test(5.5);

        System.out.println("Результат: " + result);
    }

    // Функція без параметрів
    public static void test() {
        System.out.print("Виведення чогось у консоль");
    }

    // Функція з параметром String
    public static void test(String word) {
        System.out.print(word);
    }

    // Функція, яка повертає значення double
    public static double test(double some_number) {
        some_number *= 2;
        return some_number;
    }
}
