package task10;

import java.util.Scanner;

/*
Write an application that gets one positive number (type int) from the user and calculates
a sum of digits of the given number. Hint: to make some operations on every single digit
of the number (digit by digit), you can calculate the remainder of dividing the number by
10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next
digit).
 */
public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int number = scan.nextInt();

        int suma = 0;

        while(number != 0) {
            suma += number % 10;  // Extragem ultima cifră și o adăugăm la sumă
            number /= 10;

        }
        System.out.println("suma cifrelor numaruli = " + suma);
        }
    }

