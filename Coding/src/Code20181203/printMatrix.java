package Code20181203;

import java.util.ArrayList;

public class printMatrix {
	public static ArrayList<Integer> printMatrixFunction(int [][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		int rStart = 0;
		int rEnd = matrix[0].length-1;
		int cStart = 0;
		int cEnd = matrix.length-1;
		

		while(rStart <= rEnd && cStart <= cEnd){
			for(int i = rStart; i < rEnd; i++){
//				System.out.print(matrix[cStart][i] + " ");
				result.add(matrix[cStart][i]);
			}
//			System.out.println();
			for(int j = cStart; j < cEnd; j++){
//				System.out.print(matrix[j][rEnd] + " ");
				result.add(matrix[j][rEnd]);
			}
//			System.out.println();
			for(int i = rEnd; i > rStart; i--){
//				System.out.print(matrix[cEnd][i] + " ");
				result.add(matrix[cEnd][i]);
			}
//			System.out.println();
			for(int j = cEnd; j > cStart; j--){
//				System.out.print(matrix[j][rStart] + " ");
				result.add(matrix[j][rStart]);
			}
//			System.out.println();
			if(rEnd == rStart && cEnd == cStart){
				result.add(matrix[cEnd][rEnd]);
			}
			rStart++;
			cStart++;
			rEnd--;
			cEnd--;
		}
		return result;    
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrixFunction(matrix);
	}
}
