package exceptionspractice;

/**
 * Created by 609540082 on 28/08/2018.
 */
public class AutoclosableDemo implements AutoCloseable {

    public void close(){
        System.out.println("Inside Close method..");
    }
}
