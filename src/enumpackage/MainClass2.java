package enumpackage;

enum Enums
{
    A
            {
                int i = 222;
            },

    B
            {
                int i = 333;
            },

    C
            {
                int i = 444;
            };

    private Enums()
    {
      //System.out.println(i);
    }

  // int i = 111;



}
public class MainClass2 {

    public static void main(String[] args) {

       // System.out.println(Enums.FindSumOfElements.i);
    }
}
