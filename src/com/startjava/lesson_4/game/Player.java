package com.startjava.lesson_4.game;

import java.util.Arrays;

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

	public void setNumber(int number, int i) {
		this.number = number;
		this.numbers[i] = number;
	}

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}