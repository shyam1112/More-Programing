import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Enter the Operator :");
            char ch=sc.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                System.out.println("Enter the two number : ");
                int x=sc.nextInt();
                int y=sc.nextInt();

                if(ch=='+'){
                    System.out.println(x+y);
                }
                else if(ch=='-'){
                    System.out.println(x-y);
                }
                else if(ch=='*'){
                    System.out.println(x*y);
                }
                else if(ch=='/'){
                    System.out.println(x/y);
                }
                else if(ch=='%'){
                    System.out.println(x%y);
                }else if(ch=='x'||ch=='X'){
                    break;
                }else{
                    System.out.println("Invalid Operater ");
                }
              
            }
        }
    }
}
