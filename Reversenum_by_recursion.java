public class Recursion5_reversenum {
    public static void main(String[] args) {
        int n =123456;
        int digit=(int)Math.log10(n)+1;
        // System.out.println(reversenum1(n,0));
        System.out.println(reversenum2(n,digit));

    }
//     public static int reversenum1(int n,int sum){
//         if(n<=0){
//             return sum;
//         }        
//         sum=sum*10+n%10;
//         return reversenum1(n/10,sum);
//     }
    public static int reversenum2(int n,int digit){
        if(n==0){
            return 0;
        }
        
        return (n%10)*((int)Math.pow(10, digit-1))+reversenum2(n/10, digit-1);
    }
}
