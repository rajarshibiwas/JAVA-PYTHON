import java.util.*;
import java.lang.*;
import java.io.*;
class shorting2{
    public static void quick_sort(int[] user_arr, int low, int high){
        if (low < high){
           int part = partition(user_arr, low, high);
           quick_sort(user_arr, low, (part-1));//left
           quick_sort(user_arr, (part+1), high);//right
        }
    }
    public static int partition(int[] user_arr, int low, int high){
        int pivot = user_arr[high];
        int pos = low;
        for(int j=low; j<high; j++){
            if (user_arr[j] < pivot){
                int temp = user_arr[pos];
                user_arr[pos] = user_arr[j];
                user_arr[j] = temp;
                pos++;
            }
        }
        int temp = user_arr[pos];
        user_arr[pos] = user_arr[high];
        user_arr[high] = temp;
        return pos;
    }
}

class main2{
    public static void main(String[] args){
        int[] user_arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the array: ");
        int range = sc.nextInt();
        System.out.println("Enter the numbers of array below");
        for(int i=0; i<range; i++){
            user_arr[i] = sc.nextInt();
        }
        shorting2.quick_sort(user_arr, 0, (range-1));
        for(int i=0; i<range; i++) {
            System.out.print(user_arr[i]+",");
        }
    }
}
