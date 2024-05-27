//Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted
//order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so
//that it contains the last M elements.

import java.sql.Array;
import java.util.*;
import java.lang.*;

class array_modificaiton {
    static void joinning(int[] new_arr1, int[] new_arr2){
        int[] new_array = new int[new_arr1.length + new_arr2.length];

        System.arraycopy(new_arr1, 0, new_array, 0, new_arr1.length);
        System.arraycopy(new_arr2, 0, new_array, new_arr1.length, new_arr2.length);

        quick_sort(new_array, 0, (new_arr1.length + new_arr2.length)-1);

        System.out.println("The array is "+ Arrays.toString(new_array));
    }
    static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int index = low;
        for(int i=low; i<high; i++){
            if (array[i] < pivot ){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        int temp = array[index];
        array[index] = array[high];
        array[high] = temp;

        return index;
    }
    static int[] quick_sort(int[] array, int low, int high){
        if (low <= high){
            int part = partition(array, low, high);
            quick_sort(array, low, part-1);
            quick_sort(array, part+1, high);
        }
        return array;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the new size of the array1: ");
        int size_arr1 = sc.nextInt();

        System.out.print("Enter the size of the array2: ");
        int size_arr2 = sc.nextInt();

        int[] arr1 = new int[size_arr1];
        int[] arr2 = new int[size_arr2];

        System.out.println("Enter the values of the array-1 below:");
        for(int i=0; i<size_arr1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the value of the array-2 below:");
        for(int i=0; i<size_arr2; i++){
            arr2[i] = sc.nextInt();
        }
        ;
        System.arraycopy(quick_sort(arr1, 0, (size_arr1-1)),0, arr1, 0,
                quick_sort(arr1, 0, (size_arr1-1)).length);
        //System.out.println(Arrays.toString(arr1));

        System.arraycopy(quick_sort(arr2, 0, (size_arr2-1)),0, arr2, 0,
                quick_sort(arr2, 0, (size_arr2-1)).length);

        joinning(arr1, arr2);
    }
}
