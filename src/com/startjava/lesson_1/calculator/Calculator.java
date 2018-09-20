package com.startjava.lesson_1.calculator;

public class Calculator {	
	public static void main(String[] args) {
		int firstNumber = 2;
		int secondNumber = 10;
		String operation = "^";

		if (operation == "+") {			
			System.out.println(firstNumber + secondNumber);
		} else if (operation == "-") {			
			System.out.println(firstNumber - secondNumber);
		} else if (operation == "*") {			
			System.out.println(firstNumber * secondNumber);
		} else if (operation == "/") {			
			System.out.println(firstNumber / secondNumber);
		} else if (operation == "%") {			
			System.out.println(firstNumber % secondNumber);
		} else if (operation == "^") {
			int result = 1;
			for (int i = 0; i < secondNumber; i++) {				
				result *= firstNumber;								
			}
			System.out.println(result);					
		}
	}
}