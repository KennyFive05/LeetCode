package LeetCode_100.LeetCode_40;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_36 {
    public boolean isValidSudoku(char[][] board) {
        List[] row = new ArrayList<>().toArray(new List[9]);
        List[] col = new ArrayList<>().toArray(new List[9]);
        List[] block = new ArrayList<>().toArray(new List[9]);

        for (int i = 0; i < 9; i++) {
            row[i] = new ArrayList();
            col[i] = new ArrayList();
            block[i] = new ArrayList();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if (!addList(row[i], ch) || !addList(col[j], ch) ||
                        !addList(block[i / 3 * 3 + j / 3], ch)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean addList(List list, char ch) {
        if (list.contains(ch))
            return false;
        if ('.' != ch)
            list.add(ch);
        return true;
    }
}
