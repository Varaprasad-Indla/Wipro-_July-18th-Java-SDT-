package Labsession24;

public class TestGame {

	 public static void main(String[] args) {
	        Game game = new Game("Chess", 101, "Board Game");
	        game.display();

	        System.out.println("Accessing members directly:");
	        System.out.println("Name: " + game.gameName);
	        System.out.println("ID: " + game.gameId);
	        System.out.println("Type: " + game.gameType);
	    }
	}
