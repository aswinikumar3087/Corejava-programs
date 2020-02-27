package serializations.serilizationwithmultipleobjects;

import java.io.Serializable;

/**
 * Created by 609540082 on 16/08/2019.
 */
public class Multipleobjects implements Serializable{
    Multipleobjects(){
        System.out.println("Multipleobjects :: ");
    }
    int a=23;
    int b=45;
}
