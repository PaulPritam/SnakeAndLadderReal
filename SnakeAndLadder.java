package snake;

import java.util.*;

public class SnakeAndLadder {

	
	public static void main(String[] args) {
		System.out.println("welcome to snake ladder game ");
		int p1 = 0;
		int p2 = 0;
		for (int i =0; i <=1; i++)
		{
		for (int pos=0; pos<=100;)
		{
			if (pos < 0 ) {
				pos = 0;
			}
		System.out.println(" position "+pos);
		Random a = new Random();
		int die = a.nextInt(6) + 1;
		if (i == 0) {
		p1 = p1++;
		}
		else
		{
		p2 = p2++;
		}
		
		System.out.println("die rolled with a value of " +die);
		int checker = a.nextInt(3);
		System.out.println(checker);
		if (checker == 0) {
			pos = pos;
			System.out.println("the player remained in the same position " +pos);
		}
		else if (checker == 1) 
		{
			
			if ((pos + die) >100) {
				
			}
			
			else {
				pos = pos + die;
				System.out.println("the player moved to " +pos);	
			}
			
	}
