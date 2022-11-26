import java.util.*;

public class horror {
    static int N;
    static int H;
    static int L;
    static ArrayList<ArrayList<Integer>> adjacencyList;
    static boolean[] visited;
    static int[] values;
    static Queue<Integer> nodeQueue;
    static int[] horrorMovies;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        H = input.nextInt();
        L = input.nextInt();
        adjacencyList = new ArrayList<>();
        visited = new boolean[N];
        values = new int[N];
        nodeQueue = new LinkedList<>();
        horrorMovies = new int[H];
        
        //POPULATE VALUES ARRAY, CREATE N ADJACENCY LISTS
        for(int i=0; i<N; i++){
            values[i] = Integer.MAX_VALUE;
            adjacencyList.add(new ArrayList<>());
        }

        //SET HORROR MOVIE VALUES TO 0
        for(int i=0; i<H; i++){
            int horror = input.nextInt();
            horrorMovies[i] = horror;
            values[horror] = 0;
        }

        //POPULATE ADJACENCY LIST
        for(int i = 0; i < L; i++){
            int node1 = input.nextInt();
            int node2 = input.nextInt();
            adjacencyList.get(node1).add(node2);
            adjacencyList.get(node2).add(node1);
        }

        input.close();

        for(int i=0; i<H; i++){
            BFS(horrorMovies[i]);
            resetVisited();
        }

        int max = -1;
        int max_index = -1;
        for(int i=0; i<N; i++){
            if(values[i] > max){
                max = values[i];
                max_index = i;
            } 
        }
        System.out.println(max_index);
    }

    private static void BFS(int node){
        visited[node] = true;
        nodeQueue.add(node);
        Integer w = nodeQueue.poll();
        while(w!=null){
            ArrayList<Integer> outgoingEdges = adjacencyList.get(w);
            for(Integer u:outgoingEdges){
                if(visited[u] == false){
                    values[u] = Math.min(values[u], values[w] + 1);
                    visited[u] = true;
                    nodeQueue.add(u);
                }
            }
            w = nodeQueue.poll();
        }
    }

    private static void resetVisited(){
        for(int i=0; i<N; i++){
            visited[i] = false;
        }
    }

}
