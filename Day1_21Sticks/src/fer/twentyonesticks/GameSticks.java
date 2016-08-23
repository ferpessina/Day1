
public class GameSticks {
	private int sticks = 21;
	
	public int remaining_sticks(){
		return sticks;
	}
	
	public void reset(){
		sticks = 21;
	}
	
	public int take(int n){
		if(n<=1){
			n = 1;
		}
		else{
			n = 2;
		}
		sticks-=n;
		return sticks;
	}
}
