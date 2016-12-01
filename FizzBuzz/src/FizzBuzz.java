class FizzBuzz {
    public static void main(String [] args)  {
        int LoopVal;
        int end_value = 40;
        for (LoopVal = 1; LoopVal <= end_value; LoopVal++){
            if (LoopVal % 3 == 0 && LoopVal % 5 == 0){
                System.out.println("FizzBuzz");
            } else  if (LoopVal % 3 == 0) {
                System.out.println("Fizz");
            } else if(LoopVal % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(LoopVal);
            }
        }
    }
}
