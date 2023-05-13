public class Recursion4_sumofdigit {
    public static void main(String[] args) {
        int n=12345;
        // int sum=0;
        // while(n>0){
        //     int x=n%10;
        //     sum=sum+x;
        //     n=n/10;
        // }
        // System.out.println(sum);
        System.out.println(sumofdigit(n));
    }
    public static int sumofdigit(int n){
        
        if(n<=0){
            return 0;
        };
        int x=n%10;
        n=n/10;
        return x+sumofdigit(n);
    }
}
