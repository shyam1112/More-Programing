import java.util.*;
public class Switchh {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Empid=in.nextInt();

        switch(Empid){
            case 1 ->System.out.println("Empid is 1");
            case 2 ->System.out.println("Empid is 2");
            case 3 ->System.out.println("Empid is 3");
            case 4 ->System.out.println("Empid is 4");
            case 5 ->System.out.println("Empid is 5");
            case 6 ->System.out.println("Empid is 6");
            default ->System.out.println("This is default case.");
        }
    }
}
