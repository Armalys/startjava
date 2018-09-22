package com.startjava.lesson_4.calculator;

public class Calculator {	
	private int firstNumber;
	private int secondNumber;
	private String operation;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void calculate() {
		switch (operation) {
			case "+":
				System.out.println(firstNumber + secondNumber);
				break;
			case "-":
				System.out.println(Math.subtractExact(firstNumber,secondNumber));
				break;
			case "*":
				System.out.println(Math.multiplyExact(firstNumber,secondNumber));
				break;
			case "/":
				System.out.println(firstNumber / secondNumber);
				break;
			case "%":
				System.out.println(firstNumber % secondNumber);
				break;
			case "^":
				System.out.println(Math.pow(firstNumber,secondNumber));
		}
	}
}