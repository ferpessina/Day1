import java.util.Scanner;

public class Player {
	//true for computer player - false for human player
	private boolean is_computer;
	
	Scanner take = new Scanner(System.in);
	
	Player(){
		this.is_computer = false;
	}
	
	Player(boolean player_type){
		this.is_computer = player_type;
	}
	
	public void setPlayerType(boolean player_type){
		this.is_computer = player_type;
	}
	
	public int play(int sticks){
		int num_to_take;
		if(is_computer){
			if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
				num_to_take = 1;
			} else {
				num_to_take = 2;
			}
			System.out.println("There are " + sticks + " sticks");
			System.out.println("Computer takes " + num_to_take + " sticks");
			return num_to_take;
		}
		else{
			System.out.println("There are " + sticks + " sticks");
			System.out.println("How many sticks would you like to take?");
			num_to_take = take.nextInt();
			return num_to_take;
		}
	}
}
