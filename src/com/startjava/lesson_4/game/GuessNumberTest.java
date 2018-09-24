package com.startjava.lesson_4.game;

public class GuessNumberTest {
	public static void main(String[] args) {
		Player playerOne = new Player();
		Player playerTwo = new Player();
		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

		do {
			guessNumber.gameStart();
            guessNumber.repeatGame();
		} while (guessNumber.getAnswer().equals("да"));


	}
}