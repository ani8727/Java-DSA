package recursion;

// recursion function
public class Basic {
    static int fact(int n){
        if(n<=1) return 1;  // base class
        return n*fact(n-1); // recursive call

    }

//    tail Recursive -> function has recursive call at last
    static int fibo(int n, int a, int b){
        if(n==0)
            return a;
        if(n==1)
            return b;
        return fibo(n-1,b,a+b); // tail recursive
    }
    public static void main(String[] args) {
        System.out.println("Factorial: "+fact(5));
        System.out.println("Fibonacci: "+fibo(7,0,1));
    }
}
