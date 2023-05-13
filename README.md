# Control-Project

## 1- Problem Statement :
Given the Signal flow graph representation of a system, the total number of nodes and numeric branches gains you are required to : 
1- make a Graphical interface.
2- Draw the signal flow graph showing nodes, branches, and gains.
3- List all the forward paths, individual loops, all combinations of n non-touching loops. 
4- Output the value of the determinant for each forward path.
5- Output the overall system transfer function.

## 2- Main Features of the program and additional options : 
1- You can add nodes to the graph, move them, change their sizes, give them names, and change it later.
2- You can connect any two nodes with an edge, set the gain of the edge, change its path, and change the gain later.
3- You can clear the graph and build it again.
4- You can exit the program.
5- After entering the output node name and clicking the calculate button you get on the Results window : 
The number of the nodes.
The forward paths and their gains.
The loops and their gains.
The system determinant
The determinants of the forward paths.
The system transfer function.
6- you can clear the program and enter a new graph after calculating a graph. 

## 3- Data Structure : 
1- The linked list is used in the representation of : 
Nodes as each node has a linked list of edges.
Forward paths as each path is a linked list of edges.
2- The vector is used in the representation of : 
Loops as each loop is a vector of vertices.
The combinations of the non touching loops.

## 4- Main Modules : 
1- Vertex has an id , name, and can be the output.
2- Edge has a source vertex, destination vertex, and weight.
3- GraphFlow is responsible for getting the forward paths of the graph, their gains and printing them.
4- Loop is responsible for getting the loops of the graph.
5- LoopDetection is responsible for getting the gains of the loops, the non touching loops, the determinants of the forward paths, and the determinant of the system.
6- TransferFunction is responsible for getting the transfer function.
7- GUI is the main program which contains all the GUI components.

## 5- Algorithms used : 
1- DFS is used in Getting the forward paths, and the loops.

## 6- Sample runs : 






## 7- Simple user guide : 

Click on the node two times to change its name and after typing the name click on any empty place.
Click on the border of the node to change its size.
To add another node click on the Add Node button and it will be added in the lower right corner.
To add an edge drag the source node from the node centre to the destination node.
To change the edge gain click on the edge two times, enter the new value then click on any empty place.
To change the path of the edge click on the edge then use the squares on the edge to change its path.
After you build the graph you should enter the output node in Output Node Name square and click calculate.
The required information will appear in the results window.
To clear the graph and start again click the clear button.
To terminate the program click the Exit button.






Routh Stability Criterion
1- Problem Statement :
Given the characteristic equation of a system and all the coefficients of s0 to sn you are required to: 
1- State if the System is stable or not Using Routh Criteria.
2- List the number of poles in the RHS of the s-plane If The System Is Not stable.

2- Main Features of the program and additional options : 
1- You can enter the coefficients of the equation as integers or double numbers.
2- After clicking Enter you get the Stability of the System and the number of poles if the System is unstable.
3- You can test any number of equations by just modifying the input text field and clicking enter.

3- Data Structure : 
1- Array is used as the representation of the equation coefficients.

4- Main Modules : 
1- Routh is responsible for building the routh table, determining the number of poles in the RHS of the S-plane.
2- RouthGui is the main app which has all the GUI components and takes the input from the user.

5- Algorithms used : 
1- The first and second row in the Routh table are built from the given coefficients first.
2- Then each row is built from the previous two rows.
3- A row is replaced with the derivative of the previous row In case the row entries are all equal to zero.
4- The number of the right poles is computed as the number of signs change in the first column.

6- Sample runs : 
s^4 + 2 s^3 + 3 s^2 + 4 s + 5 : 

s^3 + 2 s^2 + 3 s^1 + 4 : 






5 s^4 + 6 s^3 + 8 s^2 + 9 s + 7 : 

1.5 s^3 + 6.8 s^2 + 9.4 s + 3.5 : 

-1.5 s^4 + 70 s^3 + 90 s^2 + 4.56 s - 90 : 

7- Simple user guide : 

Enter the coefficients of the System equation in a sorted order according to their S exponent from the greatest exponent of S to the constant including all the coefficients between them in the upper textfield.
Click Enter on the keyboard to get the required information in the lower label.
