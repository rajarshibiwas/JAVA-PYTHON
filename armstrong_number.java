//Armstrong number

import java.util.*;
import java.lang.*;
import java.math.*;

class armstrong_number {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int result = 0;

        //System.out.print("Enter the number you want to check Armstrong: ");
        int armstrong = 153;//sc.nextInt();
        double start_time = System.nanoTime();
        int size = Integer.toString(armstrong).length();
        int num = armstrong;

        while(num > 0){
            //int reminder = num % 10;
            result = (int) (result + Math.pow((num % 10),size));
            num = num / 10;
        }
        if (armstrong == result){
            System.out.println("The given number "+result+" is armstrong");
        }
        else{
            System.out.println("The given number "+armstrong+" is no armstrong");
        }
        double final_time = System.nanoTime();
        double difference = final_time - start_time;
        System.out.print("Time taken: "+difference/1000000);//Avg time is
    }
}
