
package task14;

/*
    Write an application that reads two lowercase letters of the Latin alphabet (type char)
    and calculates how many characters is there in the alphabet between given letters.
    Hint - use the ASCII code table and treat the characters as int numbers.

    Input:
        a e

    Algoritm:
        a b c d e
        Solutia 1:
            - facem diferenta in modul intre valoarea decimala a caracterelor folosindu ne de ascii

        Solutia 2:
            - o sa utilizam un contor care va itera printr-un for pornind de la caracterul de start, pana la
            caracterul de final

    Output:
        3
 */

import java.util.Scanner;

public class AsciiAlphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti prima litera: ");
        char literaDeStart = scanner.next().charAt(0);

        System.out.print("Introduceti a doua litera litera: ");
        char literaDeSfarsit = scanner.next().charAt(0);

        // se poate inlocui cu isUpperCase in cazul in care se utilizeaza litere mari
        if (!Character.isLowerCase(literaDeStart) || !Character.isLowerCase(literaDeSfarsit)) {
            System.out.println("Ambele litere ar trebui sa fie mici!");
            return;
        }

        System.out.println("Distanta dintre litere este: " + calculeazaDistLitSol1(literaDeStart, literaDeSfarsit));
        System.out.println("Distanta dintre litere este: " + calculeazaDistLitSol2(literaDeStart, literaDeSfarsit));
    }

    private static int calculeazaDistLitSol2(char literaDeStart, char literaDeSfarsit) {
        int contor = 0;
        for (char i = (char) (literaDeStart + 1); i < literaDeSfarsit; i++) {
            contor++;
        }

        return contor;
    }

    private static int calculeazaDistLitSol1(char literaDeStart, char literaDeSfarsit) {
        /*
        int asciiStart = (int) literaDeStart;
        int asciiSfarsit = (int) literaDeSfarsit;

        return Math.abs(asciiSfarsit - asciiStart) - 1;
        */
        return Math.abs(literaDeStart - literaDeSfarsit) - 1;
    }
}
