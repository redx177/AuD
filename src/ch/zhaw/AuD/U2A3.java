package ch.zhaw.AuD;

import java.util.Arrays;

public class U2A3 {

    public static void main(String[] args) {
		int n = 9;
	    int n1 = n-1;
	    char c = '*';
	    int half = (int) Math.floor(n/2);

	    char[][] board = new char[n][n];
	    board[half][0] = c;
	    board[half][n1] = c;

	    int i = 1;
	    while (i < half+1) {
		    board[half+i][i] = c;
		    board[half][i] = c;
		    board[half-i][i] = c;
		    i++;
	    }

	    int j = half-1;
	    while (i < n1) {
		    board[half+j][i] = c;
		    board[half][i] = c;
		    board[half-j][i] = c;
		    i++;
		    j--;
	    }


	    // Output:
	    for (i = 0; i < n; i++) {
		    for (j = 0; j < n; j++)
			    System.out.print(board[i][j] == '*' ? "*" : " ");
			System.out.println();
	    }
    }
}
