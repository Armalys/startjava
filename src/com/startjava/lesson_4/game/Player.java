package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int number;
	private int[] numbers;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}