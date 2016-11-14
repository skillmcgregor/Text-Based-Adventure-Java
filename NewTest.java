package textbasedadventure;
import java.util.Scanner;
public class NewTest {
	public static void main(String[] args) {
		boolean win = false;
		Scanner input = new Scanner(System.in);
		CentralRoom central = new CentralRoom();
		WestRoom west = new WestRoom();
		NorthRoom north = new NorthRoom();
		EastRoom east = new EastRoom();
		SouthRoom south = new SouthRoom();
		int direction = 0;
		while (win == false) {
			do {
				System.out.println("You are in a large room with four doors around you, one in each cardinal direction. Which direction would you like to go?");
				String polaris = input.nextLine();
				if ((polaris.equals("North")) || (polaris.equals("north")) || (polaris.equals("up")) || (polaris.equals("Up"))) {
					direction = 1;
				}
				if ((polaris.equals("West")) || (polaris.equals("west")) || (polaris.equals("left")) || (polaris.equals("Left"))){
					direction = 2;
				}
				if ((polaris.equals("East")) || (polaris.equals("east")) || (polaris.equals("right")) || (polaris.equals("Right"))) {
					direction = 3;
				}
				if ((polaris.equals("South")) || (polaris.equals("south")) || (polaris.equals("down")) || (polaris.equals("Down"))) {
					direction = 4;
				}
				switch (direction) {
				case 1: {
					System.out.println("You are in a small grey room. The back wall appears to be cracked.");
					do {
						System.out.println("1: Look around \n2: Interact \n3: Back to the central room");
						north.choice = input.nextInt();
						switch (north.choice) {
						case 1: {
							if (north.screwer == 1) { 
								System.out.println("You see a small object on the ground. Pick it up?");
								System.out.println("1: Yes \n2: No");
								north.objectchoice = input.nextInt();
								switch (north.objectchoice) {
								case 1: {
									System.out.println("You picked up a [screwdriver].");
									north.screwer = 0;
									break;
								}
								case 2: {
									break;
								}
								default: {
									System.out.println("That's not an option.");
									break;
								}
								}
								break;
							}
							if (north.screwer == 0) {
								System.out.println("Nothing seems to stand out except the crack in the back wall.");
								break;
							}
							break;
						}
						case 2: {
							System.out.println("The wall has a large crack in it. Try to break it down?");
							System.out.println("1: Yes \n2: No");
							north.wallchoice = input.nextInt();
							switch (north.wallchoice) {
							case 1: {
								if (north.screwer == 1) {
									System.out.println("You punch the wall. Your arm falls off. Better try something else.");
								}
								if (north.screwer == 0) {
									System.out.println("The wall falls to the mighty power of the screwdriver. Guess the wall was pretty weak.");
								}
								break;
							}
							case 2: {
								break;
							}
							case 3: {
								System.out.println("That's not an option.");
								break;
							}
							}
							break;
						}
						case 3: {
							direction = 0;
							break;
							
						}
						default: {
							System.out.println("That's not an option.");
							break;
						}
						}
					}	while (north.choice != 3);
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
				case 0: {
					break;
				}
				default: {
					System.out.println("You don't know how directions work you chotch. Try another.");
					break;
				}
				}
			} while (direction < 5);
		}
	}
}
