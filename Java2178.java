import java.io.*;
import java.util.*;

public class Main {
    static int[][] maze;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }
        br.close();
        bfs(0, 0);
        System.out.print(maze[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point[0] + dx[i];
                int ny = point[1] + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && maze[nx][ny] == 1) {
                    maze[nx][ny] = maze[point[0]][point[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
