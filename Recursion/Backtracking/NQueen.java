import java.util.*;

public class NQueen {

    public static void main(String[] args) {
        int n = 4;

        List<List<String>> ans = SolveNQueen(n);

        for (List<String> board : ans) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static boolean IsSafe(int row, int col, List<String> board, int n) {

        // Check upper-left diagonal
        int r = row;
        int c = col;

        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        // Check left side
        r = row;
        c = col;

        while (c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            c--;
        }

        // Check lower-left diagonal
        r = row;
        c = col;

        while (r < n && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r++;
            c--;
        }

        return true;
    }

    public static void Solve(
            int col,
            List<String> board,
            List<List<String>> ans,
            int n) {

        // Base condition
        if (col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        // Try every row in this column
        for (int row = 0; row < n; row++) {

            if (IsSafe(row, col, board, n)) {

                // Place Queen
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());

                // Recursive call
                Solve(col + 1, board, ans, n);

                // Backtrack
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public static List<List<String>> SolveNQueen(int n) {

        List<List<String>> ans = new ArrayList<>();

        List<String> board = new ArrayList<>();

        // Create empty board
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        Solve(0, board, ans, n);

        return ans;
    }
}