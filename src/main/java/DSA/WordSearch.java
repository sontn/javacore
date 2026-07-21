package DSA;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(
            char[][] board,
            String word,
            int row,
            int col,
            int index
    ) {
        // Da tim het cac ky tu
        if (index == word.length()) return true;

        //Out of bound
        if (row < 0 ||
            row >= board.length ||
            col < 0 ||
                col >= board[0]. length
        ) return false;

        // Khong khop ky tu
        if (board[row][col] != word.charAt(index)) return false;

        // Danh dau da tham
        char temp = board[row][col];
        board[row][col] = '#';

        boolean found =
                dfs(board, word, row + 1, col, index + 1) ||
                        dfs(board, word, row - 1, col, index + 1) ||
                        dfs(board, word, row, col + 1, index + 1) ||
                        dfs(board, word, row, col - 1, index + 1);
        // Backtrack
        board[row][col] = temp;
        return found;
    }
    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        WordSearch ws = new WordSearch();

        System.out.println(ws.exist(board, "ABCCED")); // true
        System.out.println(ws.exist(board, "SEE"));    // true
        System.out.println(ws.exist(board, "ABCB"));   // false
    }
 }
