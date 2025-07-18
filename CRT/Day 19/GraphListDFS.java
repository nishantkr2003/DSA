import java.util.*;

public class GraphListDFS {
    
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int totalVertices;
    static boolean directed;


    public static void addEdge(int start,int end){
        graph.get(start).add(end);
        if(!directed){
            graph.get(end).add(start);
        }
    }

    public static void dfsSearch(int current){
        visited[current] = true;
        System.out.print(current + " ");
        for(int neighbor : graph.get(current)){
            if(!visited[neighbor]){
                dfsSearch(neighbor);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        totalVertices = sc.nextInt();

        System.out.print("Is the graph directed?: ");
        directed = sc.nextBoolean();

        graph = new ArrayList<>();
        for(int i = 0; i < totalVertices; i++){
            graph.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int totalEdges = sc.nextInt();

        System.out.println("Enter edges (start end):");
        for(int i = 0; i < totalEdges; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            addEdge(start, end);
        }
        visited = new boolean[totalVertices];
        System.out.print("/nDFS traversal");
        for(int vertex = 0; vertex < totalVertices; vertex++){
            if(!visited[vertex]){
                dfsSearch(vertex);
            }

        } 
    }
}
