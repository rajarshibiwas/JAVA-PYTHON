import java.util.*;
import java.lang.*;

class BFS {
     private static int vertex;
     private static ArrayList<ArrayList<Integer>> main_stack = new ArrayList<>();
    static void array_list(int ver){
        vertex = ver;
        for(int i=0; i<vertex; i++){
            main_stack.add(new ArrayList<>());
        }
    }
    static void adding_list(int ver, int value){
        main_stack.get(ver).add(value);
    }
    static void breadth_first_search(int start_point){
        boolean[] visited = new boolean[vertex];
        ArrayList<Integer> queue = new ArrayList<>();

        visited[start_point] = true;
        queue.add(start_point);

        while(!queue.isEmpty()){
            start_point = queue.removeFirst();
            System.out.print(start_point+",");

            Iterator<Integer> itration = main_stack.get(start_point).listIterator();
            while(itration.hasNext()){
                //This loop check if list already present in main_stack 2D array has value and keeps going forward until last element
                int temp_value = itration.next();
                //This help us to take next value of list already present in main_stack 2D array
                if(!visited[temp_value]){//this check if the index/vertex already visited or not if not then next part
                    visited[temp_value] = true;
                    queue.add(temp_value);

                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertex: ");
        int ver = sc.nextInt();

        array_list(ver);

        System.out.print("Enter the number of edges your graph has: ");
        int edges = sc.nextInt();
        edges = edges * 2;

        for(int i=0; i<edges; i++){
            System.out.print("Enter the vertex: ");
            int point_vertex = sc.nextInt();

            System.out.print("Enter the value: ");
            int point_value = sc.nextInt();

            adding_list(point_vertex, point_value);

        }
        System.out.print("Enter the starting point: ");
        int start_point = sc.nextInt();
        breadth_first_search(start_point);

    }
}
