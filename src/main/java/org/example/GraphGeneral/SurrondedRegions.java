package org.example.GraphGeneral;

public class SurrondedRegions {
    public static void main(String[] args) {
    SurrondedRegions surrondedRegions = new SurrondedRegions();
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
    surrondedRegions.solve(board);
    }
    public void solve(char[][] board) {
        if(board[0].length<0 || board.length<0)
            return;
        int rows = board.length;
        int cols = board[0].length;
        for(int i=0; i<cols; i++){
            //Top
            if(board[0][i] == 'O'){
                dfs(board, 0, i);
            }
            //Bottom
            if(board[rows-1][i] == 'O'){
                dfs(board, rows-1, i);
            }
        }
        for(int j=0; j<rows; j++){
            //left
            if(board[j][0] == 'O'){
                dfs(board, j, 0);
            }
            //right
            if(board[j][cols-1] == 'O'){
                dfs(board, j, cols-1);
            }
        }

        //capture and restore
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='T')
                    board[i][j]='O';
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!='O'){
            return;
        }
        board[i][j] = 'T';
        //Top
        dfs(board, i+1, j);
        //bottom
        dfs(board, i-1, j);
        //left
        dfs(board, i, j-1);
        //right
        dfs(board, i, j+1);

    }
}
