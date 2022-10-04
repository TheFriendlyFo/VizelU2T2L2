import java.util.ArrayList;

public class Game {

    public static class Player {
        private final String name;
        private int points;

        public Player(String name) {
            this.name = name;
            points = 0;
        }

        // Getters for the different attributes:
        public String getName(){return name;}
        public int getPoints(){return points;}

        public void increasePoints(int inc) {points += inc;}
        public boolean checkWon(int winPoints) {return points >= winPoints;}
    }


    // instance variables:
    private final String gameName;
    private final int winPoints;
    private final ArrayList<Player> players;
    private boolean gameOver;
    private int round;

    // constructor
    public Game(String gameName, int winPoints) {
        this.gameName = gameName;
        this.winPoints = winPoints;
        players = new ArrayList<>();
        gameOver = false;
        round = 0;
    }

    // returns the name of the game
    public String getGameName() {return gameName;}
    // returns if the game is still going:
    public boolean getGameOver() {return gameOver;}

    // Adds a player to the game:
    public void addPlayer(String name){
        players.add(new Player(name));
    }

    // Plays a round of the game by adding a random amount of points to each player.
    public void play() {
        round++;
        int points;

        System.out.printf("\n\nRound %s:\n\n", round);

        for (Player p : players) {
            points = (int) (Math.random() * 5);
            p.increasePoints(points);
            System.out.printf("%s has earned %s points! They now have %s points.\n", p.getName(), points, p.getPoints());

            if (p.checkWon(winPoints)) {
                System.out.printf("\n%s has won this game of %s!", p.getName(), gameName);
                gameOver = true;
                return;
            }
        }
    }
}

