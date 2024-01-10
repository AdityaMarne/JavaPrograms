package Assingment3;

import java.util.Scanner;

class Gusser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Gusser kindly guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player kindly guess the number :");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Gusser g=new Gusser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare()
	{
		if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
		{
			System.out.println("All players won the game");
		}else if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2) {
			System.out.println("Player 1 and 2 won the game");
		}else if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
			System.out.println("Player 1 and 3 won the game");
		}else if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
			System.out.println("Player 2 and 3 won the game");
		}else if(numFromGuesser == numFromPlayer1){
			System.out.println("Player 1 won the game");
		}else if(numFromGuesser == numFromPlayer2){
			System.out.println("Player 2 won the game");
		}else if(numFromGuesser == numFromPlayer3){
			System.out.println("Player 3 won the game");
		}else {
			System.out.println("Game lost try again");
		}
	}
}

public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
