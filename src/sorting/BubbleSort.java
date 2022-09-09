package sorting;

import java.util.Arrays;


public class BubbleSort {

    static void bubble(int[] arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap = false;
            for (int j=1;j<arr.length-i;j++){
                if (arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }
=======
public class BubbleSort{
>>>>>>> refs/heads/MergeSort

<<<<<<< HEAD
=======
    static void bubble(int[] arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap = false;
            for (int j=1;j<arr.length-i;j++){
                if (arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }

>>>>>>> refs/heads/MergeSort
    public static void main(String[] args) {
        int arr[] = {4,5,7,8,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}

