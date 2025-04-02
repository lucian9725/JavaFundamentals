
package task10;

/*
    Write an application that gets one positive number (type int) from the user and calculates
    a sum of digits of the given number. Hint: to make some operations on every single digit
    of the number (digit by digit), you can calculate the remainder of dividing the number by
    10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
    digit).

    Input: 178821

    Algoritm:
        - instr. repetitiv: while, do while, for
            - nr % 10 => calculeaza restul impartirii la 10
            - sum = sum + rest
            - nr / 10 => eliminarea ultimei cifre

    Output:
        1+7+8+8+2+1 => 26
 */

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar pozitiv: ");
        int nr = scanner.nextInt();

        if (nr <= 0) {
            System.out.println("Ati introdus un numar invalid!");
            return;
        }

        System.out.println("Suma cifrelor este: " + calculeazaSumaCifrelor(nr));
    }

    private static int calculeazaSumaCifrelor(int nr) {
        int sumaCif = 0;

        while (nr > 0) {
            sumaCif = sumaCif + nr % 10;
            nr = nr / 10;
        }

        return sumaCif;
    }
}
