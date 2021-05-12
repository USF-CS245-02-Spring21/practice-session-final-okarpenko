package problem7;

public class Graph {

    public static void printBFS(int[][] matrix,  int sourceVertex) {
        boolean[] visited = new boolean[matrix.length];
        visited[sourceVertex] = true;
        System.out.println(sourceVertex);

        Queue queue = new ArrayQueue();
        queue.enqueue(sourceVertex);

        while (!queue.empty()) {
            // FILL IN CODE

        }
    }


    public static void main(String[] args) {
        // This is a graph you can test your code on:
        Graph g = new Graph();

        int[][] matrix = new int[5][5];
        // Edges from 0 to 1 and 2
        matrix[0][1] = 1;
        matrix[0][2] = 1;

        // Edges from 1 to 0, 2, 3
        matrix[1][0] = 1;
        matrix[1][2] = 1;
        matrix[1][3] = 1;

        // Edges from 3 to 0, 2 and 4
        matrix[3][0] = 1;
        matrix[3][2] = 1;
        matrix[3][4] = 1;

        //Edge from 4 to 2
        matrix[4][2] = 1;
        printBFS(matrix, 0);
        // Should print 0, 1, 2, 3, 4
    }
}
