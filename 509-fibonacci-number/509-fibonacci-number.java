class Solution {
    public int fib(int n) {
        int fibonacci;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci=fib(n-1)+fib(n-2);
        }
    }
}