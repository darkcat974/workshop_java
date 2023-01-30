package com.github.darkcat974.workshop_java;

public class FizzBuzz {
    public static void main(String... args) {
        for (int i = 0; i < 200; i++) {
            if (i%3 > 0 && i%5 > 0) {
                System.out.print(i + "\n");
            }
            else if (i%3 == 0 && i%5 > 0) {
                System.out.print(i + "-> Fizz\n");
            }
            else if (i%3 > 0 && i%5 == 0) {
                System.out.print(i + "-> Buzz\n");
            }
            else {
                System.out.print(i + "-> FizzBuzz\n");
            }
        }
    }
}
