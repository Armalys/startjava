package com.startjava.lesson_4.game;

public class Player {
	private String name;
	private int number;
	private int[] numbers = new int[10];
    private int attempt;
    private boolean status;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

    public void setNumbers(int numbers, int i) {
        this.numbers[i] = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}