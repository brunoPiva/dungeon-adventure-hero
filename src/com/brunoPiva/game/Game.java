package com.brunoPiva.game;

import com.brunoPiva.util.StartMenu;

public class Game {

	public static void main(String[] args) {
		StartMenu menu = new StartMenu();
		boolean isRunning = true;
		while(isRunning) {
			isRunning = menu.initMenu();
		}
	}

}
