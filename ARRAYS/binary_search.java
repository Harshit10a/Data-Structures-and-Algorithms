import java.util.Arrays;

public class GravityPuzzle {

    public static int solution(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // This will store the minimum distance the figure needs to fall in each column
        int[] minFall = new int[cols];
        Arrays.fill(minFall, Integer.MAX_VALUE); // Initially, assume the figure can't fall

        // We need to find the lowest row where the figure can land without hitting an obstacle
        for (int col = 0; col < cols; col++) {
            // Find the top-most '*' in the column
            int figureTopRow = -1;
            for (int row = 0; row < rows; row++) {
                if (board[row][col] == '*') {
                    figureTopRow = row;
                    break;
                }
            }

            // If there is no figure part in this column, we skip this column
            if (figureTopRow == -1) {
                continue;
            }

            // Now we calculate how far the figure can fall in this column
            int fallDistance = 0;
            for (int row = figureTopRow; row < rows; row++) {
                if (board[row][col] == '#') {
                    // We've hit an obstacle, the figure must land just above it
                    fallDistance = row - figureTopRow;
                    break;
                }
                if (row == rows - 1) {
                    // If we reached the bottom of the board without hitting an obstacle
                    fallDistance = rows - figureTopRow;
                }
            }

            // We now store the minimum fall distance for the column
            minFall[col] = Math.min(minFall[col], fallDistance);
        }

        // We now calculate how many obstacles need to be removed in order for the figure to fall
        int obstaclesToRemove = 0;
        for (int col = 0; col < cols; col++) {
            if (minFall[col] == Integer.MAX_VALUE) {
                continue; // No figure part in this column, so we skip
            }

            int figureBottomRow = rows - minFall[col]; // The row where the figure will land

            // Count the number of obstacles between the figure's current position and where it will land
            for (int row = figureBottomRow - minFall[col]; row < figureBottomRow; row++) {
                if (board[row][col] == '#') {
                    obstaclesToRemove++;
                }
            }
        }

        return obstaclesToRemove;
    }