/** 
Course: JAC444
Kolodko
Adam
ahkolodko 027 980 127
SAB

This assignment represents my own work in accordance   with Seneca Academic Policy

Date: Oct/12/2017

EightQueens, Displays a checkerboard this 8 queens that are not in line of sight of eachother
Requires initialization class
Adam Kolodko
*/

class EightQueens {
	int size;
	boolean[][] grid;
	EightQueens(int newSize){
		//construct
		size = newSize;
		grid = new boolean[size][size]; //[rows][columns]
		
		//run recursive function
		tryPlace(0);
		
		//print grid
		for(int i = 0; i < size; i++){
			System.out.print("|");
			for(int j = 0; j < size; j++){
				if(grid[i][j])
					System.out.print("Q|");
				else
					System.out.print(" |");
			}
			System.out.print("\n");
		}
	}
	
	private boolean tryPlace(int row){
		boolean exit = false;
		//for each column in function's row
		for(int i = 0; (i < size) && !exit; i++){
			if(testPosition(row, i)){
				grid[row][i] = true;
				//solve if bottom of grid
				if(row == size - 1){
					exit = true;
				}
				//search next row
				else if(tryPlace(row+1)){
					exit = true;					
				} else {
					//clean up mess if on imposible path
					grid[row][i] = false;
				}
			}
		}
		return exit;
	}
	
	private boolean testPosition(int row, int col){
		int r;
		int c;
		//test north
		for(int i = 0; i < size; i++){
			if(grid[i][col])
				return false;
			
		}
		//reset position
		r = row;
		c = col;
		//test NorthWest
		while(r >= 0 && c >= 0){
			if(grid[r][c])
				return false;
			r--;
			c--;
		}
		//reset position
		r = row;
		c = col;
		//test NorthEast
		while(r >= 0 && c >= 0 && c < size){
			if(grid[r][c])
				return false;
			r--;
			c++;
		}
		
		return true;
	}
}
