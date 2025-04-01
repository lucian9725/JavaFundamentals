package task8;

/*
    Write an application that implements a simple calculator. The application should:
    a. read first number (type float)
    b. read one of following symbols: + - / *
    c. read second number (type float)
    d. return a result of given mathematical operation
    If the user provides a symbol other than supported, the application should print "Invalid
    symbol".

    If the entered action cannot be implemented (i.e. it is inconsistent with the
    principles of mathematics), the application should print "Cannot calculate".

    Input Exemplu:
        12  - nextFloat
        /   - next
        2   - nextFloat

    Algoritm:
        switch(operator)
            - case +
            - case -
            - case *
            - case / -> Cannot calculate
            - default -> Invalid symbol

    Ouput Exemplu:
    6
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        double primulNumar = scanner.nextDouble();

        System.out.print("Introduceti un operator matematic (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        // citim un String care contine un singur caracter
        // facem conversia de la String "+" la char '+' prin extragerea unui caracter cu metoda charAt(index)
        /*
            String = stocheaza siruri de caractere folosind "" -> StringBuilder = pseudo clasa wrapper
            char = stocheaza caractere individuale folosind '' -> Character = tipul de date wrapper peste char
                -- char[] = array de char, care stocheaza un sir de caractere
                -- List<Character> list = new ArrayList()<> -> structura de date de tipul list care stocheaza siruri de caractere
         */

        System.out.print("Introduceti al doilea numar: ");
        double alDoileaNumar = scanner.nextDouble();

        System.out.println(primulNumar + " " + operator + " " + alDoileaNumar);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (primulNumar + alDoileaNumar));
                break;

            case '-':
                System.out.println("Result: " + (primulNumar - alDoileaNumar));
                break;

            case '*':
                System.out.println("Result: " + (primulNumar * alDoileaNumar));
                break;

            case '/':
                if (alDoileaNumar == 0) {
                    System.out.println("Cannot calculate");
                    throw new ArithmeticException("Division by zero");
                } else {
                    System.out.println("Result: " + (primulNumar / alDoileaNumar));
                    break;
                }

            default:
                System.out.println("Invalid symbol");
                throw new InputMismatchException("Symbol is not supported");
        }
    }
}
