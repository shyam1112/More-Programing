public class Factorial {

    public static void main(String[] args) {
        int n=8;
        System.out.println(0);
        System.out.println(1);
        fib(n-2, 0, 1,1);
    }

    static void fib(int n,int f1,int f2,int f3){
        f3=f1+f2;
        if(n==0){
            System.out.println(f3);
            return;
        }
        System.out.println(f3);
        f1=f2;
        f2=f3;
        fib(n-1, f1, f2,f3);

    }
}
