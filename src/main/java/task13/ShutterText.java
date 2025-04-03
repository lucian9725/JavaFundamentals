
package task13;

/*
    Write an application that "stutters", that is, reads the user's text (type String), and prints
    the given text, in which each word is printed twice.
    For example, for the input: "This is my test" the application should print "This This is is
    my my test test".

    Input:
        String line = "This is my test"

    Algoritm:
        - citim sub forma de linie
        - split intr-un array de String unde indexam fiecare cuvant
        - in mod repetitiv o sa construim un nou string repetand fiecare cuvant de pe pozitia curenta


    Output:
        "This This is is my my test test".
 */

import java.util.Scanner;

public class ShutterText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un text: ");
        String input = scanner.nextLine();

        String[] cuvinteArray = input.split(" ");
        System.out.println("Array-ul de cuvinte este: " + cuvinteArray);

        StringBuilder cuvinteDuplicate = new StringBuilder();   // builder = este o clasa obiect unde metodele returneaza clasa de definitie
        for (int i = 0; i < cuvinteArray.length; i++) {
            // conceptul de actualizare continua a unui obiect se numeste inlantuire (chaining)
            cuvinteDuplicate
                    .append(cuvinteArray[i])
                    .append(" ")
                    .append(cuvinteArray[i])
                    .append(" ");

            System.out.println("i = " + i + " " + cuvinteDuplicate.toString());
        }

        System.out.println(cuvinteDuplicate.toString().trim() + "\n");
        // trim = elimina caracterele albe de la finalul unui string

        String[] splitted = cuvinteDuplicate.toString().split(" ");
        StringBuilder eliminateWord = new StringBuilder();

        int contor = 0;
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].equals("are") && contor == 0) {
                contor++;
            } else {
                eliminateWord
                        .append(splitted[i])
                        .append(" ");

                System.out.println(eliminateWord.toString());
            }
        }
    }
}
