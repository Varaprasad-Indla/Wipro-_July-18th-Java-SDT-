package Labsession24;

public class Game {
	String gameName;
    int gameId;
    String gameType;

    
    Game(String name, int id, String type) {
        this.gameName = name;
        this.gameId = id;
        this.gameType = type;
    }

  
    void display() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Game ID: " + gameId);
        System.out.println("Game Type: " + gameType);
    }
}