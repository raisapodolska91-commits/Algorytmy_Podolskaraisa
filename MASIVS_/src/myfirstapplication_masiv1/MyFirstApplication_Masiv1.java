package myfirstapplication_masiv1;

import java.io.*;

public class MyFirstApplication_Masiv1 {

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static float getFloat() throws IOException {
        String s = getString();
        return Float.parseFloat(s);
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Введіть перше число: ");
        float a1 = getFloat();
        
        System.out.print("Введіть друге число: ");
        float a2 = getFloat();
        
        float sum = a1 + a2;
        float diff = a1 - a2;
        float prod = a1 * a2;
        
        System.out.println("--- Результати обчислень ---");
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + diff);
        System.out.println("Добуток: " + prod);
        
        if (a2 != 0) {
            float div = a1 / a2;
            System.out.println("Частка: " + div);
        } else {
            System.out.println("Частка: Ділення на нуль неможливе!");
        }
    }
}