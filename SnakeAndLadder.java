
public class SnakeAndLadder {

	SnakeAndLadder() {
	System.out.println("Snake and Ladder game played with single player at start position 0");
	}

	void Game(){
		int PlayerPosition=0;
		int StartPosition=0;

		int RollDice=(int) ( (Math.floor (Math.random() * 10) % 6) + 1);
		System.out.println("The Dice Roll is "+RollDice);

		int PlayerCheck=(int) Math.floor(Math.random() * 10) % 3;
		// PlayerCheck= 0 Then Player goes down by Snake
		// PlayerCheck= 1 Then Player  Not Play
		// PlayerCheck= 2 Then Player climb Ladder
		switch (PlayerCheck) {
			case 0:
					System.out.println("SNAKE");
					PlayerPosition-=RollDice;
					break;
			case 1:
					System.out.println("No Play");
					break;
			case 2:
					System.out.println("LADDER");
					PlayerPosition+=RollDice;
					break;
		}
		if(PlayerPosition < 0)
				PlayerPosition=0;

		System.out.println("Player Position is "+PlayerPosition);
	}

	public static void main(String args[]) {
	SnakeAndLadder Snake=new SnakeAndLadder();

	Snake.Game();
	}
}
