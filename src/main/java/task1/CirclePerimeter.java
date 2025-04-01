package task1;

/*
    Write an application that will read diameter of a circle (variable of type float) and
    calculate perimeter of given circle.
    Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    Input: 12 (diametru)

    Solution:
        perimeter = pi * diametru

    Output: perimeter

    Alte informatii:
    Clasa = este un spatiu in care putem scrie cod compilabil

    Tipuri de clase:
        - Clasele de executie (Runnable Class): este o clasa care are in interior o metoda de executie 'main'
        - Clasele de obiect (Object Class): este o clasa care ne permite sa definim caraceristicile unui obiect
        (fie el abstract sau palpabil)
 */

import java.util.Scanner;

public class CirclePerimeter {

    // prescurtare pt metoda main -> psvm
    public static void main(String[] args) {
        // prescurtare pt metoda de afisare -> sout
        System.out.println("Hi! My name is Dave!");

        // Input: Citirea datelor de intrare de la consola
        Scanner scanner = new Scanner(System.in);

        // print vs println - prima metoda afiseaza fara sa coboare pe randul urmator
        System.out.print("Introduceti valoarea diametrului: ");
        float diametru = scanner.nextFloat();   // se va uita pe streamul de intrare (consola) si va prelua informatiile definite la tastatura
//        double diametru2 = scanner.nextDouble();
        System.out.println("Diametrul citit este: " + diametru + "\n");

        // Algoritm: O sa calculam perimetrul
        // definirea manuala a lui pi
        float piManual = 3.14f;
        float perimeterManual = piManual * diametru;

        float piClass = (float) Math.PI;
        float perimeterClass = piClass * diametru;

        double perimeterDouble = Math.PI * diametru;

        // Output: Afisam rezultatul in urma algoritmului
        System.out.println("Perimetru calculat cu pi definit manual este: " + perimeterManual); // CTRL+D = duplica linia
        System.out.println("Perimetru calculat cu pi definit prin clasa Math: " + perimeterClass);
        System.out.println("Perimetru calculat cu pi double: " + perimeterDouble);

        // inchideti streamul de afisare
        scanner.close();
    }

}
