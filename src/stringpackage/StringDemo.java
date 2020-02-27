package stringpackage;

public class StringDemo
{
    public static void main(String [] args) throws  Exception{

        String str = "aswini";

       str.concat("kumar");
        System.out.println(str);
        System.out.println(str.hashCode());

        String str1 = str.concat("kumar");
        System.out.println(str);
        System.out.println(str.hashCode());

      //  System.out.println(str ==str1);

        String str2 = new String("aswini");
        String str3 = new String("aswini");
        System.out.println(str2.equals(str3));
        System.out.println(str2==str3);

        System.out.println(str==str2);


    }

}
