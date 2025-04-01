package task11;

/*
Write an application that will read texts (variables of the String type) until the user gives
the text "Enough!" and then writes the longest of the given texts (not including the text "Enough!").
If the user does not provide any text, write "No text provided".
 */

import java.util.Scanner;

public class LongestText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestText = null;

        while (true) {
            System.out.print("Introduceti un text (sau 'Gata!' pentru oprirea programului): ");
            String inputText = scanner.nextLine();

            if (inputText.equals("Gata!")) {
                break; // iesim din bucla
            }

            if (inputText.isEmpty()) {
                continue;
            }

            if(longestText == null) {
                longestText = inputText;
            }
            if (inputText.length() > longestText.length()) {
                longestText = inputText;
            }
        }

        if (longestText != null) {
            System.out.println("Cel mai lung text introdus este: " + longestText);
        } else {
            System.out.println("Nu a fost introdus niciun text.");
        }

    }
}
