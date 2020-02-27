package mtct;

/**
 * Created by 609540082 on 28/01/2020.
 */
public class MTCTCal {
    public static void main(String[] args) {
        String networkServiceId = "01412610011";
        int telNoIndex = networkServiceId.indexOf('/');
        System.out.println("telenoIndex"+telNoIndex);
     String telephoneNumber= networkServiceId.substring(0, telNoIndex);
    }
}
