public class Player
{
    private String name;
    private int position;
    public Player(String n, int p)
    {
        name = n;
        position = p;
    }
    public String getName()
    {
        return name;
    }
    public int getPosition()
    {
        return position;
    }
    public void changePosition(int p)
    {
        if (p==7)
        {
            position -= p;
        }
        else if ((p!=2 && p!=12) && p!=5)
        {
            position+=p;
        }
    }
    public void setPosition()
    {
        if (position<0)
        {
            position = 0;
        }
    }
}