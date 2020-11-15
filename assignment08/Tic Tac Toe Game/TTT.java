package ttt.java;

public class TTT {

    private char[][] board = new char[3][3];

    private char marks;

    public char getMarks() {
        return marks;
    }

    public void setMarks(char marks) {
        this.marks = marks;
    }

    //consturctor
    public TTT(){
        marks = 'x';
        restoreBoard();
    }

    //ensure board is empty.
    public void restoreBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3 ;j++){
               board[i][j] = '-';
            }
        }
    }

    public void printBoard(){
        System.out.println("------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "| ");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }

   // check whether or not the board is full. It will return true if the board is full and a false otherwise.
    public boolean isBoardFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (board[i][j] == '-'){
                    return false;
                }
            }
        }

        return true;
    }

    //check won
    public boolean checkForWin(){
        if (checkColumnsForWin() || checkRowsForWin() ||checkDiagonalsForWin()){
            System.out.println("Congratulations! YOU WIN!");
        }
            return false;
    }

    private boolean checkRowsForWin(){
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true){
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin(){
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true){
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin(){
        if(checkRowCol(board[0][0], board[1][1], board[2][2]) == true ||
                checkRowCol(board[0][2], board[1][1], board[2][0]) == true ){
            return true;
        }
        return false;
    }

    private boolean checkRowCol(char c1, char c2, char c3){
        if (c1 != '-' && c1 == c2 && c2 == c3){
            return true;
        }
        return false;
    }

    public void changeMarker(){
        if (marks == 'x'){
            marks = 'o';
        }
        else {
            marks = 'x';
        }
    }

    public boolean placeMark(int row, int col){
        if ((row >= 0) && (row < 3)){
            if ((col >= 0) && (col < 3)){
                if (board[row][col] == '-'){
                    board[row][col] = marks;
                    return true;
                }
            }
        }
        return false;
    }

}
