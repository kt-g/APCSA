public class Recursion{
    public Recursion(){
        
    }
    public int sumOfFirstNNumber(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfFirstNNumber(n-1);
    }
    public int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public int fibValue(int loc){
        if(loc==0){
            return 1;
        }
        if(loc==1){
            return 1;
        }
        return fibValue(loc-1)+fibValue(loc-2);
    }
    public int collatz(int num){
        if(num==1){
            return 0;
        }
        else if(num%2==0){
            return collatz(num/2)+1;
        }
        else{
            return collatz(num*3+1)+1;
        }
    }
}
