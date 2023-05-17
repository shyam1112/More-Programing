public class Rec_pattern1{
    public static void main(String[] args) {
        // int i=4;
        // int j=4;
        int n=4;
        // pattern(0,0,n);
        pattern1(0,0,n);

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    public static void pattern(int i,int j,int n){
        if(i==(n)){
            return;
        }
        if(j==(n-i)){
            System.out.println();
            pattern(i+1, 0, n);
        }else{
        System.out.print("*");
        pattern(i, j+1,n);
        }
    }
    public static void pattern1(int i,int j,int n){
        if(i==n){
            return;
        }
        if(j==i+1){
            System.out.println();
            pattern1(i+1, 0, n);
        }else{
            System.out.print("*");
            pattern1(i, j+1,n);
        }
    }
}
