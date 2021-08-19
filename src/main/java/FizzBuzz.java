public class FizzBuzz {
    int number;
    public FizzBuzz(int number){
        this.number=number;
    }
    public String fizzBuzz(){
        if(number%3==0)
            return "Fizz";
        if(number%5==0)
            return "Buzz";
        return null;
    }
}
