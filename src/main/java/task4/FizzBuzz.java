package task4;

/*
    Write an application that takes a positive number from the user (type int) and writes all
    numbers from 1 to the given number, each on the next line, with the following changes:
    - in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    - in place of numbers divisible by 7, instead of a number the program should write
    "Buzz"
    - if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
    - default -> daca nicio regula nu se respecta, se va afisa numarul
 */

import java.util.Scanner;

public class FizzBuzz {

    /*
        Input:
            - number
            - verificare pentru numere valide
        Algoritm:
            - for
            - verificare divisibilitate
        Output:
            - afisare rezultat
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar pozitiv: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Numarul introdus este negativ!");
            return;
        }

        // scurtatura pt for -> fori
        // [1,number] - iteratia prin interval se face cu ajutorul variabilei i
        processNumberAndDisplayOutput(number);
    }

    // CTRL + ALT + L = format code
    // CTRL + ALT + O = optimize imports
    // CTRL + Z = undo

    // metoda void = produce un efect de genul display, etc
    private static void processNumberAndDisplayOutput(int number) {
        for (int i = 1; i <= number; i++) {
            if (checkDiv(i, 3) && checkDiv(i, 7)) { // i % 21 == 0 sau checkDiv(i, 21)
                System.out.println("Fizz Buzz -> " + i);
            } else if (checkDiv(i, 3)) {
                System.out.println("Fizz -> " + i);
            } else if (checkDiv(i, 7)) {
                System.out.println("Buzz -> " + i);
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean checkDiv(int number, int div) {
        return (number % div == 0);
    }
}

// comentariu liniar

/* comentariu pe mai multe linii */

/*
    if (checkDiv(i, 3) && checkDiv(i, 7)) { // i % 21 == 0 sau checkDiv(i, 21)
        System.out.println("Fizz Buzz -> " + i);
    } else if (checkDiv(i, 3)) {
        System.out.println("Fizz -> " + i);
    } else if (checkDiv(i, 7)) {
        System.out.println("Buzz -> " + i);
    } else {
        System.out.println(i);
    }
 */

/*
    if (i % 3 == 0 && i % 7 == 0) { // i % 21 == 0
        System.out.println("Fizz Buzz -> " + i);
    } else if (i % 3 == 0) {
        System.out.println("Fizz -> " + i);
    } else if (i % 7 == 0) {
        System.out.println("Buzz -> " + i);
    } else {
        System.out.println(i);
    }
 */
