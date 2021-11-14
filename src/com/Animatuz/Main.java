package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double variableX = readDouble();
        int variableN = readInt();

        calcFormula(variableX, variableN);

    }

    static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное число (x): ");
        return scanner.nextDouble();
    }

    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число (n): ");
        int value = scanner.nextInt();
        if (value < 1) {
            System.out.println("Ошибка! Натуральное число должно быть больше или равно 1.");
            return readInt();
        }
        return value;
    }

    static void calcFormula(double x, int n) {
        double numeratorValue = (x - 2);
        double denominatorValue = (x - 1);
        for (double bracketValue = (x - 4); bracketValue == (x - 2 * (double) n); bracketValue = bracketValue - 2) {
            numeratorValue = numeratorValue * bracketValue;
        }
        for (double bracketValue = (x - 3); bracketValue == (x - (2 * (double) n) - 1); bracketValue = bracketValue - 2) {
            denominatorValue = denominatorValue * bracketValue;
        }
        System.out.println("Ответ: " + numeratorValue / denominatorValue);
    }

}
