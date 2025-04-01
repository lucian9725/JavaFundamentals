package task2;

/*
    Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    Your application should read two variables: weight (in kilograms, type float) and height (in centimeters, type int).
    BMI should be calculated given following formula:

    BMI = weight [kg] / height [m] ^ 2

    The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
    Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.

    Input:
        weight,
        height

    Algoritmul:
        - convertim inaltimea din cm in m
        - calculam bmi dupa formula

    Output:
        - verificim daca bmi apartine intervalului inchis [18.5,24.9] si producem un mesaj personalizat
 */

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        // Citire
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti valoarea greutatii in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Introduceti valoarea inaltimii in cm: ");
        double height = scanner.nextDouble();

        // Algoritm
        // todo: extrageti calculul bmi intr-o metoda care sa intoarca un double
        double heightInMeters = height / 100;
        double bmi = weight / Math.pow(heightInMeters, 2); // heightInMeters * heightInMeters
        double bmi2 = weight / Math.pow(height / 100, 2); // heightInMeters * heightInMeters

        // Afisare
        // todo: extrageti verificarea conditionala intr-o metoda care sa intoarca un boolean
        // todo: utilizati switch in loc de if
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI is optimal -> " + bmi);
        } else {
            System.out.println("BMI is not optimal -> " + bmi);
        }
    }

}
