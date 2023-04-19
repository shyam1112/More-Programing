import java.util.Arrays;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class SelectionSort {
  public static void main(String[] args) {
        int[] arr={4,6,3,2,1,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
  }  
  static void selection(int[] arr){
    
    for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;
        int max=getMax(arr,0,last);
        swap(arr,max,last);
     

    }
  }

  static void swap(int[] arr,int max,int end){
    int temp=arr[max];
    arr[max]=arr[end];
    arr[end]=temp;
  }
  static int getMax(int[] arr,int start,int end){
    int max=start;
    for(int i=start;i<=end;i++){
        if(arr[max]<arr[i]){
            max=i;
        }
    }
    return max;
  }
}
