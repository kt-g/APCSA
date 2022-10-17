public class Package
{
    private int x;
    private int y;
    private int z; 
    private int weight;
    public Package(int a, int b, int c, int w)
    {
        x = a;
        y = b;
        z = c;
        weight = w;
    }
    public int getLength()
    {
        if ((x>y && x>z) || (x==y && x>z) || ((x==y) && (x==z)))
        {
            return x;
        }
        else if ((y>x && y>z) || (y>x && y==z))
        {
            return y;
        }
        else
        {
            return z;
        }
    }
    public int getWeight()
    {
        return weight;
    }
    public int getGirth()
    {
        if ((x>y && x>z) || (x==y && x>z) || ((x==y) && (x==z)))
        {
            return 2*y+2*z;
        }
        else if ((y>x && y>z) || (y>x && y==z))
        {
            return 2*x+2*z;
        }
        else
        {
            return 2*y+2*x;
        }
    }
}
