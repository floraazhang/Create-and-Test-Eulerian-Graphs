import java.util.*;
import java.lang.*;
import java.io.*;

public class testGraph {

	public static final int node = 1000;

	public static String testEulerianPath(int[][] m){
		
		// number of nodes that have odd number of degree
		int num = 0;

		for (int i = 0; i < node; i++){
			int degOut = 0;
			int degIn = 0;
			for (int j = 0; j < node; j++){	
				if (m[i][j] == 1)
					degOut++;
				if (m[j][i] == 1)
					degIn++;
			}
			if (degOut != degIn)
				num++;
		}

		if (num > 2)
			return "No Eulerian path.";
		return "Has Eulerian Path.";
	}

	public static String testEulerianCycle(int[][] m){
		
		// number of nodes that have odd number of degree
		int num = 0;

		for (int i = 0; i < node; i++){
			int degOut = 0;
			int degIn = 0;
			for (int j = 0; j < node; j++){	
				if (m[i][j] == 1)
					degOut++;
				if (m[j][i] == 1)
					degIn++;
			}
			if (degOut != degIn)
				return "No Eulerian Cycle.";
		}

		return "Has Eulerian Cycle.";
	}


	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++){
			String fileName = "/Users/xinyuezhang/Google Drive/CS591/HW2/Eulerian-Cycle/Eulerian-Cycle"+i+".txt";
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
		  	String str= br.readLine();

		  	int[][] matrix = new int[node][node];
		  	while ((str = br.readLine()) != null){
		    	String[] splited = str.split(" ");
		    	int node1 = Integer.parseInt(splited[0]);
		    	int node2 = Integer.parseInt(splited[1]);
		    	int edge = Integer.parseInt(splited[2]);
		  		matrix[node1][node2] = edge;
		  	}

		  	String result1 = testEulerianPath(matrix);
		  	String result2 = testEulerianCycle(matrix);
		  	System.out.println("Graph "+i+": " + result1 + " " + result2);

		  	// print matrix
		 //  	System.out.println("\n   0 1 2 3 4 5 6 7 8 9\n");
		 //  	for (int z = 0; z < 10 ; z++){
			// 	System.out.print(z+"  ");
			// 	for (int j = 0; j < 10 ; j++){
			// 		System.out.print(matrix[z][j]+" ");
			// 	}
			// 	System.out.println();
			// }

			
		}
	}
}








