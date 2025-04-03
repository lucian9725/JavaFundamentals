
package task16;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubSeqEOF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 3 8 4 2 5 6 11 13 7
//        int[] numere = new int[0];    // NU PUTETI DECLARA UN ARRAY CU DIMENSIUNE 0 SI SA CITITI
        int[] numere = new int[10];  // ESTE NEVOIE MEREU SA DEFINIM CAPACITATEA ARRAY-ULUI
        System.out.print("Introduceti numerele dorite: ");
        int contor = 0; // este fie echivalentul i-ului de la for, fie valoarea ce va ajunge sa fie finala dim
        while (scanner.hasNextInt()) {
            numere[contor] = scanner.nextInt(); // VA ARUNCA MEREU INDEX OUT OF BOUND
            contor++;
        }

        /*
        SOLUTIE CU ARRAYLIST DIN COLLECTION:
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
         */
        /*
            Introduceti numerele dorite: 1 3 8 4 2 5 6 11 13 7 EOF (echivalentul lui enter)

            scanner.hasNextInt() => true
                -> contor = 0 => numere[0] = 1
                -> contor++; => contor = 1

            scanner.hasNextInt() => true
                -> contor = 1 => numere[1] = 3
                -> contor++; => contor = 2

            ...

            scanner.hasNextInt() => true
                -> contor = 8 => numere[8] = 13
                -> contor++; => contor = 9

            scanner.hasNextInt() => true
                -> contor = 9 => numere[9] = 7
                -> contor++; => contor = 10

             scanner.hasNextInt() => false
                -> se opreste citirea, iesim din while
                -> contor = 10 (unde ati mai vazut ca e 10? la dim)
                -> arrayul numere[10] = {1 3 8 4 2 5 6 11 13 7}
         */

        System.out.println(contor + " " + Arrays.toString(numere));
        System.out.println("Lungimea maxima a unei sub-secvente crescatoare este: " + calculeazaLungimeaMaxSubSeq(contor, numere));
    }

    private static int calculeazaLungimeaMaxSubSeq(int dim, int[] numere) {
        int lungimeaMaxima = 1, lungimeaCurenta = 1;

        for (int i = 0; i < dim - 1; i++) {
            if (numere[i] < numere[i + 1]) {
                lungimeaCurenta++;
                lungimeaMaxima = Math.max(lungimeaMaxima, lungimeaCurenta);
            } else {
                lungimeaCurenta = 1;
            }
        }

        return lungimeaMaxima;
    }
}
