
package task12;

/*
    Write an application that reads a text from the user (type String) and counts a percentage
    of occurrences of a space character

    Input:
        String line = Ana are mere

    Algoritm:
        - numaram nr de spatii
            - o sa consideram textul ca fiind un sir de caractere,
            unde fiecare caracter e indexat pornind de la 0
        - calculam procentajul -> contor / lungimeMaxima * 100

    Output:
        procentajul = 2/12*100 = 16.6%
 */

import java.util.Scanner;

public class SpacePercentage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un text: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Textul este gol, procentajul spatiilor este 0%");
            return;
        }

        System.out.println("Procentajul spatiilor este: " + calculeazaProcentajulSpatiilor(input) + "%");
        System.out.printf("Procentajul spatiilor este: %.3f%%", calculeazaProcentajulSpatiilor(input));
    }

    private static double calculeazaProcentajulSpatiilor(String input) {
        int contorSpatii = 0;   // sau schimbati int cu double in loc de conversia de pe return

        // algoritmul
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                contorSpatii++;
            }
        }

        return (double) contorSpatii / input.length() * 100;
    }
}
