import java.util.Scanner;

class square{
    static int sqrt(int value){
        int low = 1,high = value;

        while(low <= high){

            int mid_value = (low+high)/2;
            int sqre = mid_value * mid_value;

            if(sqre == value){
                return mid_value;

            }
            else if(sqre < value){
                low = mid_value + 1;
            }
            else{
                high = mid_value - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to get square_root: ");
        int value = sc.nextInt();

        int return_value = sqrt(value);

        if(return_value != 0){
            System.out.println("The square root of the given number: "+value+" is "+return_value);
        }
        else{
            System.out.println("There is no square root for the given number: "+value);
        }
    }
}