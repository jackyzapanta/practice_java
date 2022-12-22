public class Main {
    public static void main(String[] args) {

        displayHighScorePosition("Jacky",
                displayHighScorePosition(1500));

        displayHighScorePosition("Jacky",
                displayHighScorePosition(1000));

        displayHighScorePosition("Jacky",
                displayHighScorePosition(500));

        displayHighScorePosition("Jacky",
                displayHighScorePosition(100));

        displayHighScorePosition("Jacky",
                displayHighScorePosition(25));
    }

    public static  void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + "managed to get into position " +
                position + "on the high score list");
    }

    public static int displayHighScorePosition(int playerScore){
        int result = 4;

        if (playerScore >= 1000)
        {
            result = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            result = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            result = 3;
        }
        return result;
    }
}
