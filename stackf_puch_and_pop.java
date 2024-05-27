import java.util.*;
import java.lang.*;

class stack_push_and_pop {

    private static int top=-1;
    private static ArrayList<Integer> stack = new ArrayList<>();

    static void push(int value, int range){
        if (top == range-1){
            System.out.println("Stack overflow");
        }
        else {
            stack.add(value);
            top++;
        }
    }
    static void pop(){
        System.out.println("The poped values: ");
        while (top >= 0){
            int store = stack.remove(top);
            System.out.print(store+",");
            top--;
        }
        System.out.println("The stack underflow: ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of the number: ");
        int range = sc.nextInt();

        System.out.println("Enter the number of the range below: ");
        for(int i=0; i<range; i++){
            int value = sc.nextInt();
            push(value, range);
        }
        pop();
    }
}
