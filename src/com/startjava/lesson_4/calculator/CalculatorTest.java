package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        String userInput;
        int i;
        String[] mathExpression = new String[3];
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        do {
            i = 0;
            System.out.print("Введите математическое выражение: ");
            userInput = scanner.nextLine();
            for (String symbol : userInput.split(" ")) {
                mathExpression[i] = symbol;
                i++;
            }
            calculator.setFirstNumber(Integer.parseInt(mathExpression[0]));
            calculator.setOperation(mathExpression[1]);
            calculator.setSecondNumber(Integer.parseInt(mathExpression[2]));
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}