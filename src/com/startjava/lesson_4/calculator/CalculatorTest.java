package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        String userInput;
        int i;
        String[] mathExpression = new String[3];
        Scanner scanner = new Scanner(System.in);

        do {
            i = 0;
            System.out.print("Введите математическое выражение: ");
            userInput = scanner.nextLine();
            for (String symbol : userInput.split(" ")) {
                mathExpression[i] = symbol;
                i++;
            }
            Calculator calculator = new Calculator(mathExpression);
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}