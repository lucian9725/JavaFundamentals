package task6;
/*
    *  Scrieti o aplicatie care ia un  numar de la utilizator ( de tip int)
    *  si calculeaza suma armonica a seriei de la 1 la n,
    *  conform cu urmatoarea formula:
    * Hn = 1 + 1/2 + 1/3 + 1/4 + ....+ 1/n.
    *
    * Input: number
    * Verificare pentru numere valide

     Algoritm:
         - for
         -calculam suma dupa formula
     *
     Output: sum
 * */

import java.util.Scanner;

public class SumaArmonica {

    public static void main(String[] args) {
        //Input: Citirea datelor de intrare de la consola
        Scanner scanner = new Scanner(System.in);//se va uita pe streamul de intrare (consola) si va prelua informatiile definite la tastatura
        System.out.print("Introduceti un numar pozitiv: ");
        int number = scanner.nextInt();
        //Algoritm:
        // Verificare pentru numere valide
        if (number < 0) {
            System.out.println("Numarul introdus este negativ! Numarul trebuie sa fie pozitiv!");
            return;
        } else {
            double sum = getCalculedSumaArmonica(number);
            System.out.println("Suma armonică pentru n = " + number + " este: " + sum);

        }
        scanner.close();

    }

    // Metodă pentru calculul sumei armonice
    private static double getCalculedSumaArmonica(int number) {
        double sum = 0.0;   // result

        // algoritm de procesare a datelor
        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

        return sum;         // return result
    }
}