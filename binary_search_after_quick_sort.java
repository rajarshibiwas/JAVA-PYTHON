import java.util.*;
import java.lang.*;

class BSQS {
    static void BISR(int[] array, int low, int high, int search_number){
        if (low <= high){
            int mid = (low + high) / 2;

            if (array[mid] == search_number){
                System.out.printf("The given number %d is present",search_number);
            }
            else if (array[mid] < search_number){
                BISR(array, mid+1, high, search_number);
            }
            else{
                BISR(array, low, mid-1, search_number);
            }
        }
        else{
            System.out.printf("The given number %d not present",search_number);
        }
    }
    static int main_partition(int[] array, int low, int high){
        int pivot = array[high];
        int index = low;

        for(int i=low; i<high; i++){
            if (array[i] < pivot){
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
    static void main_quick_sort(int[] array, int low, int high){
        if (low < high){
            int part = main_partition(array, low, high);
            main_quick_sort(array, low, (part-1));
            main_quick_sort(array, (part+1), high);
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the value of the array one-by-one below: ");

        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        main_quick_sort(array, 0, (size-1));
        System.out.println("The sorted array is: "+Arrays.toString(array));

        System.out.print("Enter the number you want to search: ");
        int search_number = sc.nextInt();
        BISR(array, 0, size-1, search_number);
    }
}
