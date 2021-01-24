
public class SnakeAndLadder {

	SnakeAndLadder() {
	System.out.println("Snake and Ladder game played with single player at start position 0");
	}

	void Game(){
		int PlayerPosition=0;
		int StartPosition=0;
		int RollDice=(int) ( (Math.floor (Math.random() * 10) % 6) + 1);
		System.out.println("The Dice Roll is "+RollDice);
	}

	public static void main(String args[]) {
	SnakeAndLadder Snake=new SnakeAndLadder();

	Snake.Game();
	}
}
