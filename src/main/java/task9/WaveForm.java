package task9;

import java.util.Scanner;

public class WaveForm {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a positive number: ");
    int length = scanner.nextInt();

    if (length <= 0) {
        System.out.println("Please enter a positive number.");
        return;
    }

    char[][] wave = new char[4][length * 3];

    // Initialize matrix with spaces
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < length * 3; j++) {
            wave[i][j] = ' ';
        }
    }

    // Draw wave pattern
    for (int i = 0; i < length; i++) {
        wave[1][i * 3] = '*'; // Mid-high point
        wave[0][i * 3 + 1] = '*'; // Peak
        wave[1][i * 3 + 2] = '*'; // Mid-high point
        wave[2][i * 3 + 1] = '*'; // Mid-low point
        wave[3][i * 3] = '*'; // Lowest point
    }

    // Print the wave
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < length * 3; j++) {
            System.out.print(wave[i][j]);
        }
        System.out.println();
    }

    scanner.close();
}
}
