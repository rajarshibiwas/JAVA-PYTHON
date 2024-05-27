//Given a positive integer n, find the pivot integer x such that:
//The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
//Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one
//pivot index for the given input

import java.util.*;
import java.lang.*;

class pivot_integer {

    static int summation(int num){
        int first_sum=0, second_sum=0;
        for(int i=1; i<=num; i++){
            for(int k=1; k<=i; k++){
                first_sum = first_sum+k;
            }
            for(int j=i; j<=num; j++){
                second_sum = second_sum+j;
            }
            if (second_sum == first_sum){
                return i;
            }
            first_sum = 0;
            second_sum = 0;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = summation(num);

        System.out.println("The value of the pivot is "+result);
    }
}
