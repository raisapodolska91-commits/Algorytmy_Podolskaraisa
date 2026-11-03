package com.itproger;
import java.util.Scanner;
class video_5 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        // String text = scan.nextLine();
        //int userNum = scan.nextInt();
        //System.out.print(userNum);

        //Математичні дії
        int a = 5, b = 10, res;
        res = a + b;
        res /= 5;
        System.out.print(res);*/

        //Практичне викорстання:

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 num: ");
        int num1 = scan.nextInt();

        System.out.print("Enter 2 num: ");
        int num2 = scan.nextInt();

        System.out.println("Res 1: " + (num1 + num2));
        System.out.println("Res 2: " + (num1 - num2));
        System.out.println("Res 3: " + (num1 * num2));
        System.out.println("Res 4: " + (num1 / num2));
        System.out.println("Res 5: " + (num1 % num2));
    }
}