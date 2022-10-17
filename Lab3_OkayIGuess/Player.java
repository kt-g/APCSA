public class Player
{
    private String name;
    private int guess;
    public Player(String n, int g)
    {
        name = n;
        guess = g;
    }
    public String getName()
    {
        return name;
    }
    public int getGuess()
    {
        return guess;
    }
}