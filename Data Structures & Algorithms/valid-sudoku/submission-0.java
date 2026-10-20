class Solution {
    public boolean isValidSudoku(char[][] board) {
        //in every row, col and block check that there should not be repeating values
        //create a boolean array to keep track of the found numbers 

        boolean rowCheck = checkRepeatingInRows(board);
        boolean colCheck = checkRepeatingInCols(board);
        boolean blockCheck = checkRepeatingInBlocks(board);

        return !rowCheck && !colCheck && !blockCheck;
    }

    //checks if there is a repeating value in rows
    private boolean checkRepeatingInRows(char[][] a){
        boolean[] hasAppeared = new boolean[10];

        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                if(a[row][col] != '.'){//if a number is present in the cell
                    int numberInCell = a[row][col] - '0';
                    if(hasAppeared[numberInCell]){
                        return true;
                    }else{
                        hasAppeared[numberInCell] = true;
                    }
                }
            }

            //refereshing the boolean array after every row
            Arrays.fill(hasAppeared, false);
        }

        return false;
    }

    private boolean checkRepeatingInCols(char[][] a){
        boolean[] hasAppeared = new boolean[10];

        for(int col = 0; col < a[0].length; col++){
            for(int row = 0; row < a.length; row++){
                if(a[row][col] != '.'){
                    int numberInCell = a[row][col] - '0';
                    if(hasAppeared[numberInCell]){
                        return true;
                    }else{
                        hasAppeared[numberInCell] = true;
                    }
                }
            }

            Arrays.fill(hasAppeared, false);
        }

        return false;
    }

    private boolean checkRepeatingInBlocks(char[][] a){
        boolean[] hasAppeared = new boolean[10];

        for(int rst=0; rst<3; rst++){
            for(int cst=0; cst < 3; cst++){
                //code to check in one block
                for(int row=0; row<3; row++){
                    for(int col=0; col<3; col++){
                        if(a[rst*3 + row][cst*3 + col] != '.'){
                            int numberInCell = a[rst*3 + row][cst*3 + col] - '0';
                            if(hasAppeared[numberInCell]){
                                return true;
                            }else{
                                hasAppeared[numberInCell] = true;
                            }
                        }
                    }
                }

                //refreshing the array after each block
                Arrays.fill(hasAppeared, false);
            }
        }

        //if no repeating value is found in any block
        return false;
    }
}
