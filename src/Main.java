public class Main {
    public static void main(String[] args) {
        Game uno = new Game("Uno", 12);

        uno.addPlayer("Seth");
        uno.addPlayer("Seth's clone");

        System.out.println("Welcome to this game of " + uno.getGameName() + "!");

        boolean hasWon = false;
        while (!hasWon) {
            uno.play();
            hasWon = uno.getGameOver();
        }
    }
}