import java.util.Scanner;
class search{
    public static void binarysearch(int[] user_arr, int low, int high, int check_num){
        if (high>=low){
            int mid = (high + low)/2;
            if (user_arr[mid] == check_num){
                System.out.printf("The number %d is present",check_num);
            }
            else if (user_arr[mid] < check_num ){
                binarysearch(user_arr, (mid+1), high, check_num);
            }
            else if (user_arr[mid] > check_num){
                binarysearch(user_arr, low, (mid-1), check_num);
            }
        }
        else{
            System.out.printf("The given number %d is not present",check_num);
        }
    }
}
class shorting{
     public static void bubbleshort(int[] user_arr, int range, Scanner inp){
            for(int i=0; i<range; i++){
                for(int j=0; j<(range-1); j++){
                    if (user_arr[j] > user_arr[j+1]){
                        int temp = user_arr[j+1];
                        user_arr[j+1] = user_arr[j];
                        user_arr[j] = temp;
                    }
                }
            }
            System.out.print("Enter the number you want to check: ");
            int check_num = inp.nextInt();
            search.binarysearch( user_arr, 0, range, check_num);
            //for(int i=0; i<range; i++){
                //System.out.print(user_arr[i]);
    }
}
class find{
    public static void main(String[] args){
        int[] user_arr = new int[100];
        System.out.print("Enter the range of the array: ");
        Scanner inp = new Scanner(System.in);
        int range = inp.nextInt();
        System.out.println("Enter the array contained below: ");
        for(int i=0 ; i<range; i++){
            user_arr[i] = inp.nextInt();
        }
        shorting.bubbleshort(user_arr, range, inp);
    }
}