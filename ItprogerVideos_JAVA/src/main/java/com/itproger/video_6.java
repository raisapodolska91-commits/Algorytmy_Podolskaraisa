package com.itproger;

import java.util.Scanner;

class video_6 {
    //Практичний приклад
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int user = scan.nextInt();

        System.out.print("Enter number: ");
        int a = scan.nextInt();

        System.out.print("Enter number 2: ");
        int b = scan.nextInt();

        System.out.print("Enter math sym: ");
        scan.nextLine(); // споживаємо залишок рядка після nextInt()
        char math = scan.nextLine().charAt(0);

        int res = 0;

        switch (math) {
            case '+':
                res = a + b;
                System.out.println("Res: " + res);
                break;

            case '-':
                res = a - b;
                System.out.println("Res: " + res);
                break;

            case '*':
                res = a * b;
                System.out.println("Res: " + res);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error");
                } else {
                    res = a / b;
                    System.out.println("Res: " + res);
                }
                break;

            default:
                System.out.println("Error");
        }
    }
}


//Умовні конструкції:
/* char sym = 't';
if (user == 5 || sym == 't') {
    System.out.println("Number is 5");
    boolean isHappy = false;
    if (!isHappy)
        System.out.println("Bool is false");
} else if (user == 67)
    System.out.println("Number is 67");
else if(user == 70)
    System.out.println("Number is 70");
else if(user > 100)
    System.out.println("Number is > 100");
else
    System.out.println("Number is undefined") */

//Switch-case:
/* switch (user) {
    case 5:
        System.out.println("Number is 5");
        break;
    case 50:
        System.out.println("Number is 50");
        break;
    case 7:
        System.out.println("Number is 7");
        break;
    default:
        System.out.println("Number is undefined");
}
*/