public class Attendant
{
    private Games game;
    public Attendant(int option)
    {
        game = new Games(option);
    }
    public void playGame() 
    {
        game.play();
    }
}
