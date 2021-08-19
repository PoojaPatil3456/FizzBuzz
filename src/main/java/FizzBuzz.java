public class FizzBuzz {
    int number;
    public FizzBuzz(int number){
        this.number=number;
    }
    public String fizzBuzz(){
        String strNumber=Integer.toString(number);
        if(number%15==0)
            return "FizzBuzz";
        else if(number%3==0 || strNumber.contains("3"))
            return "Fizz";
        else if(number%5==0 || strNumber.contains("5"))
            return "Buzz";
        return null;
    }
}
