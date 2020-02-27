package exceptionspractice;

public class CustomException extends Exception{

    private String errorCode;
    private String ErrorDesc;
    private String message;


    public CustomException( String message,String errorCode, String errorDesc) {
        this.message = message;
        this.errorCode = errorCode;
        ErrorDesc = errorDesc;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "errorCode='" + errorCode + '\'' +
                ", ErrorDesc='" + ErrorDesc + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
