package DSA;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    private TrieNode root = new TrieNode();
    private List<String> result = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {

        //Build Trie
        for (String word : words) {
            insert(word);
        }

        int m = board.length;
        int n = board[0].length;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c< n; c++) {
                dfs(board, r, c, root);
            }
        }

        return  result;
    }

    private void insert(String word) {
        TrieNode curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }

        curr.word = word;
    }

    private void dfs(char[][] board, int r, int c, TrieNode node) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] == '#') return;

        char ch = board[r][c];
        TrieNode next = node.children[ch - 'a'];
        if (next == null) return;

        if (next.word != null) {
            result.add(next.word);

            next.word = null;
        }

        board[r][c] = '#';
        dfs(board, r + 1, c, next);
        dfs(board, r - 1, c, next);
        dfs(board, r, c + 1, next);
        dfs(board, r,c - 1, next);

        board[r][c] =ch;
    }
}
