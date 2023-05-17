import java.util.Arrays;

public class Rec_bubblesort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 ,5,3,9,6,8,7};
        bubblesort(arr, 0, 0);

    }

    private static void bubblesort(int[] arr, int i, int j) {
        if (j == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (i < arr.length - j-1) {
            if (arr[i] >= arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                bubblesort(arr, i + 1, j);
            } else {
                bubblesort(arr, i + 1, j);
            }
        } else {
            bubblesort(arr, 0, j + 1);
        }
    }
}
