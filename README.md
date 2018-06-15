# Create and Test Eulerian Graphs in Java
> - **createGraph.java:** the program can output 10 directed graphs that contain Eulerian paths but no Eulerian cycles. It can also output 10 random graphs that contain Eulerian cycles. The number of nodes are random within 1000.
> - **testGraph.java:** this program read txt files. The txt files must represent directed graphs. The output will tell if each of the graphs contains a Eulerian path or a Eulerian cycle. At the end of the output, a de Bruijn sequences of length 5 will be shown.
> - **The “Eulerian-Path” folder** contains 10 examples of directed Eulerian-Path graphs.
> - **The “Eulerian-Cycle” folder** contains 10 examples of directed Eulerian-Cycle graphs.
> - **The “Non-Eulerian” folder** contains 10 examples of directed Non-Eulerian graphs.

## Create new Eulerian-Path Graphs:
1. Download **createGraph.java** to your desktop
2. Open terminal and cd to the enclosing folder
3. Type **"javac createGraph.java"** to compile
4. Type **"java createGraph"** to run
5. 10 examples of Eulerian-Path graphs will be created in txt files in the folder

## Create new Eulerian-Cycle Graphs:
1. Download **createGraph.java** to your desktop
2. Open terminal and cd to the enclosing folder
3. Go to the main function and change the fileName to "Eulerian-Cycle"
4. Replace **int[][] m = genEulerianPath(node)** with **int[][] m = genEulerianCycle(node)**
3. Type **"javac createGraph.java"** to compile
4. Type **"java createGraph"** to run
5. 10 examples of Eulerian-Cycle graphs will be created in txt files in the folder


## Test whether are Eulerian Graphs:
1. Download **testGraph.java** to your desktop
2. If you are testing with your own graphs in txt files: open **testGraph.java** and go to the main function. Replace the variable fileName with your path to your txt files.<br>
If you are testing one file at a time, comment out the for loop at the beginning. If you wish to test all txt files and there is a pattern in your file name, feel free to use the for loop.
3. Open terminal and cd to the enclosing folder
4. Type **"javac testGraph.java"** to compile
5. Type **"java testGraph"** to run
6. The output will tell if each of the graphs contains a Eulerian path or a Eulerian cycle.



