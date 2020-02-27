package enumpackage;

enum Levels
{
    TOP, MEDIEUM(10), BOTTOM(20, 30);

    int i, j;

    private Levels()
    {

    }

    private Levels(int i)
    {
        this.i = i;
    }

    private Levels(int i, int j)
    {
        this.i = i;

        this.j = j;
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(Levels.TOP.i);

        System.out.println("TOP :: j"+Levels.TOP.j);

        System.out.println("MEDIUM :: i"+Levels.MEDIEUM.i);

        System.out.println("MEDIUM :: j"+Levels.MEDIEUM.j);

        System.out.println("BOTTOM :: i"+Levels.BOTTOM.i);

        System.out.println("BOTTOM :: j"+Levels.BOTTOM.j);
    }
}
