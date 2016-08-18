import java.util.Scanner;

public class TwentyOneSticks {

	public static void main(String[] args) {
		GameSticks sticks = new GameSticks();
		Scanner take = new Scanner(System.in);
		int numToTake = 0;

		while (sticks.remaining_sticks() > 0) {

			System.out.println("There are" + sticks.remaining_sticks() + " sticks");
			System.out.println("How many sticks would you like to take?");
			numToTake = take.nextInt();

			if (sticks.take(numToTake) <= 0) {
				System.out.println("You lose! :C");
			} else {

				if ((sticks.remaining_sticks() - 2) % 3 == 0 || sticks.remaining_sticks() - 2 == 0) {
					numToTake = 1;
				} else {
					numToTake = 2;
				}
				System.out.println("Computer takes " + numToTake + " sticks");
				
				if (sticks.take(numToTake) <= 0) {
					System.out.println("You win! :D");
				}
			}

			
		}
		take.close();
	}
}
