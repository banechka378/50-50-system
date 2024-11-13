package task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра додекаэдра: ");
        double edgeLength = scanner.nextDouble();

        double volume = (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(edgeLength, 3);

        System.out.printf("Объем додекаэдра с ребром %.2f равен %.4f\n", edgeLength, volume);

        scanner.close();
    }
}