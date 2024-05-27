//to move all the zero to the right and non-zero to the left

import java.util.*;
import java.lang.*;

class move_all_zero_to_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of the array: ");
        int range = sc.nextInt();

        int[] array_store = new int[range];

        System.out.print("Enter the value of the below: ");
        for (int i = 0; i < range; i++) {
            int value = sc.nextInt();
            array_store[i] = value;
        }
        solve(array_store, range);
    }
        public static void solve(int[] array_store, int range){
        for(int i=0; i<range; i++){
                for(int j=(range-1); j>i; j--) {
                    if (array_store[i] == 0 & array_store[j] != 0) {
                        int temp = array_store[i];
                        array_store[i] = array_store[j];
                        array_store[j] = temp;
                    }
                }
        }
        for(int i=0; i<range; i++) {
            System.out.print(array_store[i] + ",");
        }
    }
}
