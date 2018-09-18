package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scanner.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setOperation(scanner.next());
			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scanner.nextInt());		
			calculator.calculate();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scanner.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (answer.equals("да"));
	}
}