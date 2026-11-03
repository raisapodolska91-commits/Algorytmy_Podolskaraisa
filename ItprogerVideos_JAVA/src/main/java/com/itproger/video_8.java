 package com.itproger;

import java.util.Scanner;

public class video_8 {
    public static void main(String[] args) {

        /*
        // Масиви даних
        int[] nums = new int[6];
        nums[0] = 500;
        nums[1] = 500;
        nums[2] = 501;
        nums[3] = 500;
        nums[4] = 500;
        nums[5] = 50;
        System.out.println(nums[0]);

        byte[] nums2 = { 6, 7, 3, 5, 3, -1 };
        */

        //Масиви та цикли
        System.out.println("Enter num: ");
        Scanner scan = new Scanner(System.in);
        int user_num = scan.nextInt();

        short[] nums = new short[user_num];

        for (int i = 0; i < user_num; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            nums[i] = scan.nextShort();
        }

        short maximum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }

        System.out.println("Maximum: " + maximum);

    }
}
