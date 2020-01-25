package com.brunoPiva.util;

import java.util.Scanner;

public class StartMenu {
	
	public boolean initMenu() {
		Scanner read = new Scanner(System.in);
		System.out.println("Dungeon Adventure Hero");
		System.out.println("1 - Start New Adventure");
		System.out.println("2 - Start DLC");
		System.out.println("3 - Quit");
		switch (read.nextInt()) {
		case 1:
			System.out.print("Está começando uma nova aventura!");
			return true;
		case 2:
			System.out.print("Está começando uma aventura de DLC!");
			return true;
		case 3:
			System.out.print("Está fechando o programa!");
			return false;
		default:
			return true;
		}
	}
}
