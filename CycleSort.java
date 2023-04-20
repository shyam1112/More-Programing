import java.util.Arrays;

public class CycleSort{
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int current){
        int temp=arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}
