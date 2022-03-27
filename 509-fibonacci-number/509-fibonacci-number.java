class Solution {
    public int fib(int n) {
        int fibonacci;
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacci=fib(n-1)+fib(n-2);
        }
    }
}