package primenumber;


public class FizzBuzzProblem {
    public static void main(String []args){

        for(int i =1;i<=25;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FIZZ BUZZ :: "+i);
            }else if(i%3==0){
                System.out.println("FIZZ :: "+i);
            }else if(i%5==0){
                System.out.println("BUZZ :: "+i);
            }
        }
    }
}
