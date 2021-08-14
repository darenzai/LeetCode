package 数组;

public class 零矩阵 {

	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		if(matrix.length<1) {
			return;
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == -1) {
					for (int j2 = 0; j2 < n; j2++) {
						if (matrix[i][j2] != -1) {

							matrix[i][j2] = 0;
						}
						if(j2==j) {
							matrix[i][j2] = 0;
						}
					}
					for (int j2 = 0; j2 < m; j2++) {

						if (matrix[j2][j] != -1) {

							matrix[j2][j] = 0;
						}
						if(j2==i) {
							matrix[j2][j]=0;
						}
					}
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1}, { 0}, {1} };
		零矩阵 l = new 零矩阵();
		l.setZeroes(matrix);
	}
}
