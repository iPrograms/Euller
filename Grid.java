
import java.util.*;

public class Grid{

public static void main(String [] args){

	int [][] grid = new int[][]{
								{2,3,5,6,7,9,7,2,4,5},
								{3,4,5,9,0,1,5,6,7,2},
								{2,4,5,1,3,4,3,1,2,3},
								{3,5,4,5,1,9,4,5,7,1},
								{4,5,9,0,9,1,4,5,7,8},
								{9,8,7,6,2,3,9,8,7,6}
							   };

	for(int row =0; row != grid.length; row++){
		
		for(int column =0; column != grid.length; column++){
			
			
			int gridWidth = grid[row].length;
			int gridHeight = grid[column].length;

			if(column+3 >= gridWidth)
			{
				break;
			}
			//left ro right
			int result = (grid[row][column]) * (grid[row][column+1]) * (grid[row][column+2]);
			//top to down
			int result1 = (grid[row][column]) * (grid[row+1][column]) * (grid[row+2][column]);

			System.out.println(grid[row][column]+"*"+grid[row][column+1]+"*"+grid[row][column+2]+ "="+ result); 
			System.out.println(grid[row][column]+"*"+grid[row+1][column]+"*"+grid[row+2][column]+ "="+ result1); 

		}
		System.out.println();
	}
 }
}