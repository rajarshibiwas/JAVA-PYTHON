import java.util.*;
import java.lang.*;

class fibonnaci_series {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        int default_num_1 = 0, default_num_2 = 1;

        //System.out.print("Enter the range of the fibonacci series: ");
        int range = 10;

        double start_time = System.nanoTime();
        System.out.print(default_num_1+","+default_num_2+",");

        for(int i=0; i<range; i++){
            default_num_2 = default_num_1 + default_num_2;
            default_num_1 = default_num_2 - default_num_1;
            System.out.print(default_num_2+",");
        }
        double final_time = System.nanoTime();
        double difference = final_time - start_time;
        System.out.print("Time taken: "+difference/1000000);//Avg time is 11.5 millisecond
    }
}
