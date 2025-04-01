package task5;

/*
    Write an application that takes a positive number from the user (type int) and prints all
    prime numbers greater than 1 and less than the given number.

    - verificati ca un numar e prim
    - for (verificati ca un numar e prim) -> printati toate numerele prime din interval

    Input: 20

    Algoritm:
        - for [2, 19]
        - verificati si afisati toate numerele prime din interval

    Output: 3, 7, 11, 13, 17
 */

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar pozitiv: ");
        int number = scanner.nextInt();

        /* todo: provocare
         *  - creati un pachet nou, de ex: utilities
         *  - creati o clasa noua utilitara, de ex: Utility
         *  - definiti o metoda booleana de verificare ca un numar este negativ
         *  hint: extrageti codul de mai jos intr-o metoda noua, intr-o clasa noua
         *  si apelati metoda in cele 2 exercitii: task4 & task5
         *
         *  apelarea metodei arata in felul urmator: Utility.metoda(number)
         */
        if (number < 0) {
            System.out.println("Numarul introdus este negativ!");
            return;
        }

        // un numar prim este un numar care are doar 2 divizori: 1 si pe el insusi
        // de ex: 7, divizori: 1,7
        // (2, 6) - interval deschis - 0 divizori => numar prim

        // de ex: 10, divizori: 1,10
        // (2, 9) - divizori: 2, 5 - 2 divizori => nu e numar prim

        for (int i = 2; i < number; i++) {
            // verificare numar prim -> i
            int contor = 0; // resetam la fiecare reintrare in bucla repetitiva

            // acest for verifica divizorii lui i
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    contor++;   // daca identificam divizori ai lui i in intervalul (2, i), contorizam
                }
            }

            if(contor == 0) {
                System.out.println(i);
            }
        }
    }
}

/*
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293.
 */
