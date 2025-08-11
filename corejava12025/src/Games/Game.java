package Games;

public class Game {
	static String gameName = "BGMI";
	static String gameId = "111000345";
	
	static String gameType = "Battle Royal";

    Game(String name, String id, String type) {
        this.gameName = name;
        this.gameId = id;
        this.gameType = type;
    }

	public static void main(String[] args) {
        System.out.println("Game Name: " + gameName);
        System.out.println("Game ID: " + gameId);
        System.out.println("Game Type: " + gameType);
    }
}
