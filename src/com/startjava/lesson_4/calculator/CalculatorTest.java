package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        String[] mathExpression;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            mathExpression = scanner.nextLine().split(" ");
            Calculator calculator = new Calculator(mathExpression);
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}