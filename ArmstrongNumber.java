import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        // Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // isArmstrong(n);
        // System.out.println(isArmstrong(n));
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

    }
    
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
        int x=n%10;
        sum+=x*x*x;
        n=n/10;
        }
        if(sum==original){
            return true;
        }else{
        return false;
        }
    }
}
