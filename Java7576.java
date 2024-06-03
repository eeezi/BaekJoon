import java.io.*;
import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[][] box = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) box[i][j] = Integer.parseInt(st.nextToken());
        }
        br.close();
        System.out.print(bfs(box));
    }

    public static int bfs(int[][] box) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 1) queue.offer(new int[]{i, j});
            }
        }

        int days = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                int[] pos = queue.poll();
                int x = pos[0];
                int y = pos[1];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < n && nx >= 0 && ny < m && ny >= 0 && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            days++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) return -1;
            }
        }
        return days - 1;
    }
}
