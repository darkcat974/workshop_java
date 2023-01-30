package com.github.darkcat974.workshop_java;
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String... args) {
        Scanner nbr = new Scanner(System.in);
        System.out.println("Your guess?");
        int min = (args.length == 2) ? Integer.parseInt(args[0]): 1;
        int max = (args.length == 2) ? Integer.parseInt(args[1]): 100;
        int guess = Integer.parseInt(nbr.nextLine());
        int upperbound = 100;
        Random find = new Random(100);
        int to_find = (int)(Math.random() * (max - min) + min);
        int i = 0;
        while (guess != to_find) {
            if (guess < to_find)
                System.out.println("Too low!");
            if (guess > to_find)
                System.out.println("Too high!");
            guess = Integer.parseInt(nbr.nextLine());
            i++;
        }
        System.out.println("You win!\nIt took you " + i + " tries.\n");
    }
}
