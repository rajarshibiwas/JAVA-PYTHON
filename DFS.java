import java.util.*;
import java.lang.*;

class DFS {
    private static int vertex;
    private static ArrayList<ArrayList<Integer>> main_stack = new ArrayList<>();

    static void list_input(int ver){
        vertex = ver;
        for(int i=0; i<vertex; i++){
            main_stack.add(new ArrayList<Integer>());
        }
    }

    static void add_in_list(int ver, int value){
        main_stack.get(ver).add(value);
    }

    static void structure(int start_point, boolean[] visited){

        System.out.print(start_point);

        visited[start_point] = true;

        Iterator<Integer> iteration = main_stack.get(start_point).listIterator();
        while(iteration.hasNext()){
            int temp_value = iteration.next();
            if (!visited[temp_value]){
                structure(temp_value, visited);
            }
        }
    }

    static void debth_first_search(int start_point){

        boolean[] visited = new boolean[vertex];
        structure(start_point, visited);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertex");
        int ver = sc.nextInt();

        list_input(ver);//making the main_stack 2d array

        System.out.print("Enter the number of connection there is with each vertex: ");
        int edges = sc.nextInt();

        for(int i=0; i<edges; i++){

            System.out.print("Enter the vertex number: ");
            int point_vertex = sc.nextInt();

            System.out.print("Enter the value of "+point_vertex+": ");
            int point_value = sc.nextInt();

            add_in_list(point_vertex, point_value);
        }
        System.out.println("The default list without DFS is: "+main_stack);

        System.out.print("Enter the start point: ");
        int start_point = sc.nextInt();

        debth_first_search(start_point);
    }
}
