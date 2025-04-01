package task5;

import java.util.Scanner;

public class PrimeNumbersGeneric {
    public static void main(String[] args) {
        int number = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduceti un numar pozitiv: ");
            number = sc.nextInt();

            if (number < 1) {
                System.out.println("Numarul introdus este negativ.");
                continue;
            } else if (number == 1) {
                System.out.println("Numarul este prim");
                return;
            } else {
                for (int i = 2; i <= number; i++) {
                    if (checkPrimeNumber(i)) {
                        System.out.println(i);
                    }
                }
            }
        } while (number < 1);
    }

    private static boolean checkPrimeNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i != number) {
                return false;
            }
        }
        return true;
    }
}
