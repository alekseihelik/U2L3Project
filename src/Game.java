public class Game
{
    private int players;
    private int score;
    private boolean gameOver;
    private double average;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    /** Add the getScore() "getter" method here */
    public int getScore()
    {
        return score;
    }

    /** Add the addPlayer() method here */
    public int addPlayer()
    {
        players = players + 1;
        return players;
    }

    /** Add the increaseScore(int increase) method here */
    public int increaseScore(int increase)
    {
        score = score + increase;
        return score;
    }

    /** Add the averageScorePerPlayer() method here */
    public double averageScorePerPlayer()
    {
        average = (double)score/players;
        return average;
    }

    public void end()
    {
        gameOver = true;
    }
}
