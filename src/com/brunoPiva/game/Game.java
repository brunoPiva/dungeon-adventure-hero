package com.brunoPiva.game;

import com.brunoPiva.util.Menu;

public class Game {

	public static void main(String[] args) {
		Menu menu = new Menu();
		boolean isRunning = true;
		while(isRunning) {
			isRunning = menu.mainMenu();
		}
	}

}
