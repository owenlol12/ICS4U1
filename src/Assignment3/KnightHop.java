package Assignment3;
import java.util.*;

public class KnightHop {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // read inputted cord
        int startX = scan.nextInt();
        int startY = scan.nextInt();
        int endX = scan.nextInt();
        int endY = scan.nextInt();
        

        // setup BFS 
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});

        // visited array stores the number of moves to reach that square.
        // We use 9x9 to accommodate 1-based indexing (1 to 8).
        // Initialize with -1 (or checks for 0 if we handle start differently).
        int[][] visited = new int[9][9]; 
        for (int[] row : visited) {
            Arrays.fill(row, -1);
        }
        visited[startX][startY] = 0; // 0 moves to be at the start



        // define all possible 8 knight moves
        int[] moveX = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] moveY = {1, -1, 1, -1, 2, -2, 2, -2};
        
        // 4. Run BFS Loop
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cX = current[0];
            int cY = current[1];

            // If we reached the target, print moves and exit
            if (cX == endX && cY == endY) {
                System.out.println(visited[cX][cY]);
                return;
            }

            // Try all 8 moves
            for (int i = 0; i < 8; i++) {
                int nextX = cX + moveX[i];
                int nextY = cY + moveY[i];

                // Check Bounds (1 to 8) and if already visited
                if (nextX >= 1 && nextX <= 8 && 
                    nextY >= 1 && nextY <= 8 && 
                    visited[nextX][nextY] == -1) {
                    
                    // Record the move count (current + 1)
                    visited[nextX][nextY] = visited[curX][curY] + 1;
                    queue.add(new int[]{nextX, nextY});
                }
            }
        }
    }
}
