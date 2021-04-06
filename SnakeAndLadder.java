package snake;

import java.util.*;

public class SnakeAndLadder {

	
	public static void main(String[] args) {
		System.out.println("welcome to snake ladder game ");	
		int pos=0;
		System.out.println("initial position "+pos);
		Random a = new Random();
		int die = a.nextInt(6) + 1;
		System.out.println("die rolled with a value of " +die);
		int checker = a.nextInt(3);
		System.out.println(checker);
		if (checker == 0) {
			System.out.println("the player remained in the same position ");
		}
		else if (checker == 1) 
		{
			pos = die;
			System.out.println("the player moved to " +pos);
		}
		else
		{
			pos = pos - die;
			System.out.println(" the player moved to " +pos);
		}
			
	}

}
