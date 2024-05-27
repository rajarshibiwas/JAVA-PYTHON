//Given an array arr[] of n elements, your task is to find the minimum number of increment operations required to make
// all the elements of the array unique. ie- no value in the array should occur more than once. In an operation a value
// can be incremented by 1 only.

import java.util.*;
import java.lang.*;

class unique_array_utilized_randomized_quicksort_trick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of the array: ");
        int range = sc.nextInt();
        int[] array = new int[range];

        System.out.println("Enter the values of the array below: ");
        for(int i=0; i<range; i++){
            int value = sc.nextInt();
            array[i] = value;
        }
        System.out.print("The old array was "+Arrays.toString(array));

        //Randomizing the array to enable(nlog(n)) time-complexity.
        int temp = array[0];
        array[0] = array[range/2];
        array[range/2] = temp;

        System.out.print(" Sorted array "+Arrays.toString(quicksort(array, 0, (range-1))));

        System.arraycopy(quicksort(array, 0, (range-1)), 0, array, 0, range);
        method(array, range);
    }
    static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int index = low;
        for(int i=low; i<high; i++){
            if(array[i] < pivot){
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
    static int[] quicksort(int[] array, int low, int high){
        if(low < high){
          int part = partition(array, low, high);
          quicksort(array, low, (part-1));//left
          quicksort(array, (part+1), high);//right
        }
        return array;
    }
    static void method(int[] array, int range){
        int count = 0;
        for(int i=0; i<range; i++){
            for(int j=0; j<range; j++) {
                if (array[i] == array[j] && j!=i) {
                    i++;
                    array[i] = array[j] + 1;
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(" the new array "+Arrays.toString(array)+" is unique with increment of "+count);
    }
}
