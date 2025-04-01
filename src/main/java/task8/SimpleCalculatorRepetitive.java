package task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculatorRepetitive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Introduceti primul numar sau 'exit' pt inchiderea programului: ");
            if(scanner.hasNext("exit")) {
                System.out.println("Calculatorul se va inchide...");
                break;
            }
            if(!scanner.hasNextDouble()) {
                System.out.println("Invalid input.");
                throw new InputMismatchException("Se accepta doar numere intregi sau 'exit'.");
            }
            double primulNumar = scanner.nextDouble();

            System.out.print("Introduceti un operator matematic (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

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
            System.out.println();
        }

    }
}

