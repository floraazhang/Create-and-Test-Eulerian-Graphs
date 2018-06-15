import java.util.*;
import java.lang.*;
import java.io.*;

public class createGraph {

    // number of nodes will be smaller than n
    public static final int n = 1000;

    // number of graphs need to generate
    public static final int graphs = 10;


    // Generate a uniformly random number between 0 and 1
    public static int genEdge(){
        Random random = new Random();
        double rv = random.nextDouble();
        if (rv < 0.5)
            return 0;
        else
            return 1;
    }

    public static int genNode(int n){
        Random random = new Random();
        int rv = 0;
        while (rv < 2)
            rv = random.nextInt(n);
        return rv;
    }

    public static int genNum(int n){
        Random random = new Random();
        int rv = random.nextInt(n);
        return rv;
    }


    // generate an Eulerian-path graph
    public static int[][] genEulerianPath(int node){

        // the matrix that stores all the edges
        int[][] m = new int[node][node];

        // check if all nodes are connected
        int[] check = new int[node];
        int count = node;

        // choose a starting node
        int from = genNum(node);
        check[from] = 1;
        count--;

        // for debug purpose
        String path = " " + from;

        while(count != 0){
            int to = genNum(node);
            while(m[from][to] == 1 || m[to][from] == 1 || from == to){
                to = genNum(node);
            }

            m[from][to] = 1;
            path += (" -> " + to);
            from = to;
            
            if (check[to] != 1){
                check[to] = 1;
                count--;
            }
        }
        // System.out.println(path);
        return m;

    }

    // generate an Eulerian-Cycle graph
    public static int[][] genEulerianCycle(int node){

        // the matrix that stores all the edges
        int[][] m = new int[node][node];

        // check if all nodes are connected
        int[] check = new int[node];
        int count = node;

        // choose a starting node
        int first = genNum(node);
        int from = first;
        check[from] = 1;
        count--;

        // for debug purpose
        String path = " " + from;

        // generate the path
        while(count != 0){
            int to = genNum(node);
            while(m[from][to] == 1 || m[to][from] == 1 || from == to){
                to = genNum(node);
            }

            m[from][to] = 1;
            path += (" -> " + to);
            from = to;
            
            if (check[to] != 1){
                check[to] = 1;
                count--;
            }
        }

        // let the last node go back to the first node
        m[from][first] = 1;
        path += (" -> " + first);

        // System.out.println(path);
        return m;
    }



    public static void main(String[] args) {

        // generate i Eulerian-path graphs
        for (int i = 0; i < graphs; i++){

            // create file
            String fileName = "Eulerian-Cycle"+i+".txt";
            File file = new File(fileName);

            // generate a new graph
            int node = genNode(n);
            int[][] m = genEulerianCycle(node);


            // print the graph in a txt file
            try{
            	PrintWriter printWriter = new PrintWriter(file);
                printWriter.println("vi vj e");

                for (int z = 0; z < node; z++){
                    for (int j = 0; j < node; j++){
                        if (m[z][j] == 1)
                            printWriter.println(z+" "+j+" "+m[z][j]);
                    }
                }
                printWriter.close();
            } catch (FileNotFoundException err) {
                err.printStackTrace();
            }
        }

    }
}







