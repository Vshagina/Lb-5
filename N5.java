package com.company;

import java.util.Scanner;

public class N5 {
    public static int multiply(int x, int y) {
        if (y == 0) {
            return 0;
        }

        if (y > 0) {
            return x + multiply(x, y - 1);
        }

        if (y < 0) {
            return -multiply(x, -y);
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число: ");
        int x = scanner.nextInt();

        System.out.print("Второе число: ");
        int y = scanner.nextInt();

        int product = multiply(x, y);
        System.out.println(product);
    }
}