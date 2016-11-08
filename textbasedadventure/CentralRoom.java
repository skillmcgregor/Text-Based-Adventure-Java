package textbasedadventure;

import java.util.Scanner;

public class CentralRoom {
	private int direction;
	private String polaris;
	public CentralRoom() {}
	
	public void initialize() {
		Scanner input = new Scanner(System.in);
		WestRoom west = new WestRoom();
		NorthRoom north = new NorthRoom();
		EastRoom east = new EastRoom();
		SouthRoom south = new SouthRoom();
		CentralRoom central = new CentralRoom();
		direction = 0;
		System.out.println("You are in a room. Which direction would you like to go?");
		polaris = input.nextLine();
		if (polaris.equals("North") || (polaris.equals("north"))) {
			direction = 1;
		}
		if (polaris.equals("West") || (polaris.equals("west"))){
			direction = 2;
		}
		if (polaris.equals("East") || (polaris.equals("east"))) {
			direction = 3;
		}
		if (polaris.equals("South") || (polaris.equals("south"))) {
			direction = 4;
		}
		switch (direction) {
			case 1: {
				north.initialize();
				break;
			}
			case 2: {
				west.initialize();
				break;
			}
			case 3: {
				east.initialize();
				break;
			}
			case 4: {
				south.initialize();
				break;
			}
			default: {
				System.out.println("You don't know how directions work you chotch.");
				central.initialize();
				break;
			}
		}
	}
}
