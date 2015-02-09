import java.util.*;

public class IsValidSudoku {
	public static boolean isValid1(char[][] board) {
		int size = board.length;
		Hashtable<Character, Boolean> table = new Hashtable<Character, Boolean> ();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				char e = board[i][j];
				if (e != '.') {
					if (table.containsKey(board[i][j])) return false;
					else {
							table.put(board[i][j], true);
					}
				}
			}
		}
		return true;
	}

	public static boolean isValid2(char[][] board) {
		int size = board.length;
		for (int i = 0; i < size; i++) {
			Hashtable<Character, Boolean> line = new Hashtable<Character, Boolean> ();
			for (int j = 0; j < size; j++) {
				char e = board[i][j];
				if (e != '.') {
					if (line.containsKey(board[i][j])) return false;
					else {
							line.put(board[i][j], true);
					}
				}
			}
		}

		for (int j = 0; j < size; j++) {
			Hashtable<Character, Boolean> line = new Hashtable<Character, Boolean> ();
			for (int i = 0; i < size; i++) {
				char e = board[i][j];
				if (e != '.') {
					if (line.containsKey(board[i][j])) return false;
						else line.put(board[i][j], true);
				}
			}
		}

		return true;
	}

	public static boolean isValidSudoku(char[][] board) {
		ArrayList<char[][]> table = new ArrayList<char[][]>();
		for (int i = 0; i < 9; i++){
			table.add(new char[3][3]);
			int row = i / 3;
			int col = i % 3;
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					table.get(i)[j][k] = board[3 * row + j][3 * col + k];
				}
			}
			if (!isValid1(table.get(i))) return false;
		}

		return isValid2(board);
	}

	public static void main(String[] args) {
		String[] str = {
			".87654321",
			"2........",
			"3........",
			"4........","5........","6........","7........","8........","9........"
		};

		char[][] board = new char[9][9];
		for (int i = 0; i < 9; i++) {
			board[i] = str[i].toCharArray();
		}
		System.out.println(isValidSudoku(board));

	}
}