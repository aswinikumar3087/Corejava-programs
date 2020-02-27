package primenumber;

public class PrimeNumber {

    public static void main(String[] args)
    {
        int a =21;
        boolean flag =true;
        for(int i =2;i<a;i++)
        {
            if(a%i==0)
            {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("number is a prime number"+a);
        }else{
            System.out.println("Number is not a prime number"+a);
        }
int v = (int)Math.sqrt(35);
        System.out.println("sqrt value of  ::"+v);
    }
}
