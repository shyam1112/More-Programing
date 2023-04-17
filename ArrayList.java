import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        Scanner in=new Scanner(System.in);

        for(int i=0;i<7;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<7;i++){
            System.out.println(list.get(i));
        }
        // System.out.println(list);
    }   
}
