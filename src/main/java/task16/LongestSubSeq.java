package task16;

/*
    Write an application that takes 10 numbers from the user (type int) and write the length
    of the longest such subsequence of these numbers, which is increasing.
    For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
    as the length of the longest increasing subsequence (underlined in the example).

    Input:
        1 3 8 4 2 5 6 11 13 7
        1 3 8 - prima sub-secventa crescatoare, cu lungimea 3
        2 5 6 11 13 - a doua sub-secventa, cu lungime 5

    Algoritm:
        - in mod iterativ vom verifica elementele vecine
            -- dimensiunea sub secventei curente va creste de fiecare data cand verif. cond. va fi adevarata
            -- daca verif e adev, atunci trebuie mereu sa actualizam maximul
            -- pe else, resetam contorul secventei curente la 1
                -- De ce la 1? Ptc lungimea secventei curente mereu contine un element, deci lungimea e 1

    Output:
        5
 */

import java.util.Scanner;

public class LongestSubSeq {

    // todo: afisati si elementele sub secventei crescatoare cu lungime maxima
    /*
        S1: lista care pastreaza si actualizeaza elementele sub secventei
        S2: structura de date de frecventa (lista, map)
        S3: ...
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti dimensiunea array-ului: ");
        int dim = scanner.nextInt();

        int[] numere = new int[dim];
        System.out.print("Introduceti " + dim + " numere: ");
        for (int i = 0; i < dim; i++) {
            numere[i] = scanner.nextInt();
        }

        System.out.println("Lungimea maxima a unei sub-secvente crescatoare este: " + calculeazaLungimeaMaxSubSeq(dim, numere));
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

    /*
        1 3 8 4 2 5 6 11 13 7
        i = 0 -> 1 < 3 => true
            => lungimeaCurenta++ => lungimeaCurenta = 2
            => lungimeaMaxima ? lungimeaCurenta => lungimeaMaxima = lungimeaCurenta = 2
        i = 1 -> 3 < 8 => true
            => lungimeaCurenta++ => lungimeaCurenta = 3
            => lungimeaMaxima ? lungimeaCurenta => lungimeaMaxima = lungimeaCurenta = 3
        i = 2 -> 8 < 4 => false
            => lungimeaCurenta = 1, in timp ce lungimeaMaxima = 3
        i = 3 -> 4 < 2 => false
            => lungimeaCurenta = 1, in timp ce lungimeaMaxima = 3
        i = 4 -> 2 < 5 => true
            => lungimeaCurenta++ => lungimeaCurenta = 2
            => lungimeaMaxima ? lungimeaCurenta => lungimeaMaxima = 3
        i = 5 -> 5 < 6 => true
            => lungimeaCurenta++ => lungimeaCurenta = 3
            => lungimeaMaxima ? lungimeaCurenta => lungimeaMaxima = 3
        i = 6 -> 6 < 11 => true
            => lungimeaCurenta++ => lungimeaCurenta = 4
            => lungimeaMaxima ? lungimeaCurenta => lungimeaMaxima = lungimeaCurenta = 4
        i = 7 -> 11 < 13 => true
            => lungimeaCurenta++ => lungimeaCurenta = 5
            => lungimeaMaxima ? lungimeaCurenta => lungimeaMaxima = lungimeaCurenta = 5

        vals:   1 3 8 4 2 5 6 11 13 7 ?
        index:  0 1 2 3 4 5 6  7  8 9 ?

        daca pornim cu indexul de la 0 -> i < dim - 1 = 9
            -> arr[i] < arr[i+1] => ne uitam in dreapta pt verificare
            -> riscul este atunci cand ajungem la i = dim - 2 (penultimul element)
                -- arr[8] < arr[9]
                -- daca i ajunge la i = dim - 1 = 9 => arr[9] < arr[10] ?!?!?!?!?!?
                -- se va arunca o exceptie ca am incercat sa preluam elemente din afara arrayului -> ArrayIndexOutOfBoundException

        daca pornim cu indexul de la 1 -> i < dim
            -> arr[i] > arr[i-1] => ne uitam in stanga pt verificare
     */
}