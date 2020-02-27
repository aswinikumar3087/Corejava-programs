package interviewwrittenquestions;

/**
 * Created by 609540082 on 25/10/2018.
 */
class A
{
    private int c;
    private int b;
    A()
    {
        c=12;
        b=13;
    }
    public int getC()
    {
        return c;
    }
    public int getB()
    {
        return b;
    }

}
public class QuestionOne extends A {
    int s;
    public void get()
    {
        getC();
        System.out.println("b"+getC());
        System.out.println("c"+getB());
    }
    public static void main(String []args)
    {
        QuestionOne one = new QuestionOne();
        one.get();
    }
}
