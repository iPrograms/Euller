
public class Spiral{
	
	public static void main(String[] args){

		int[][] spiralGrid = new int[1001][1001];
		spiralArrayPopulate(spiralGrid,0,0,1000,1000,1002001); //1000,1002001
		printGrid(spiralGrid);
		
	}

	public static int[][]  spiralArrayPopulate(int[][] myGrid,int top, int left, int down, int right,int number){

		int n = number;
		
		//Base case look for the center
		if(myGrid.length ==0 || ((top == down) && (left == right) )){
			myGrid[top][down] =1;
			return myGrid;	
		}
		
		//top row, keep moving to the left 
		for(int i=right; i!=left; i--){
			myGrid[top][i] = n;
			n--;
		}
		//left column, keep going down 
		for(int k=top; k!= down; k++){
			myGrid[k][left] = n;
			n--;
		}
		//top to bottom
		for(int i=top; i!=down; i++){
			myGrid[down][i] = n;
			n--;
		}
		//down to to top, keep going up
		for(int k=down; k!=top; k--){
			myGrid[k][right] = n;
			n--;
		}
		//return remaining empty cells
		return spiralArrayPopulate(myGrid,top+1,left+1,down-1,right-1,n);
	}

	public  static void printGrid(int[][] myGrid){
		
		int diag =0;
		//print the entire grid
		for(int i=0; i!=myGrid.length; i++){
			for(int j=0; j!= myGrid.length; j++){
				System.out.print("["+myGrid[i][j]+"]");
			}
			System.out.println();
		}
		//get left to right diagonal
		for(int i=0; i!=myGrid.length; i++){
			for(int j=0; j!= myGrid.length; j++){
				
				if(i==j){
					diag+=myGrid[i][j];
				}
			}
		}
		//get right to left diagonal
		for(int i=0; i<myGrid.length;i++){
			int num = myGrid.length-1;
			diag+=myGrid[i][num-i];
			num--;
		}
		
		diag= diag-1;
		System.out.println("SUM of Diagnol :\t"+diag);
	}
}