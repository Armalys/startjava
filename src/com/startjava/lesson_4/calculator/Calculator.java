package com.startjava.lesson_4.calculator;

public class Calculator {	
	private String[] mathExpression;

	public  Calculator (String[] mathExpression) {
        this.mathExpression = mathExpression;
    }

	public void calculate() {
		int firstNumber = Integer.parseInt(mathExpression[0]);
		int secondNumber = Integer.parseInt(mathExpression[2]);
		switch (mathExpression[1]) {
			case "+":
				System.out.println(firstNumber + secondNumber);
				break;
			case "-":
				System.out.println(Math.subtractExact(firstNumber, secondNumber));
				break;
			case "*":
				System.out.println(Math.multiplyExact(firstNumber, secondNumber));
				break;
			case "/":
				System.out.println(firstNumber / secondNumber);
				break;
			case "%":
				System.out.println(firstNumber % secondNumber);
				break;
			case "^":
				System.out.println(Math.pow(firstNumber, secondNumber));
				break;
		}
	}
}