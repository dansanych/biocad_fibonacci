package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер члена последовательности:");
        int n = scanner.nextInt();
        int[] fibRow = new int[n];
        fibRow[0] = 0;
        fibRow[1] = 1;
        getFibonacci(fibRow);
        System.out.println(Arrays.toString(fibRow));

    }

    public static void getFibonacci(int[] fibRow) {
        for (int i = 2; i < fibRow.length; ++i) {
            fibRow[i] = fibRow[i - 1] + fibRow[i - 2];
        }
    }

}
