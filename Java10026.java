import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[][] painting;
    static boolean visited[][];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        painting = new String[n][n];

        for(int i=0; i<n; i++) {
            painting[i] = br.readLine().split("");
        }

        int normal = 0;
        visited = new boolean[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j]) {
                    dfs(i, j);
                    normal++;
                }
            }
        }

        int abnormal = 0;
        visited = new boolean[n][n];
        colorWeakness();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j]) {
                    dfs(i, j);
                    abnormal++;
                }
            }
        }

        System.out.print(normal + " " + abnormal);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < painting.length && ny < painting.length) {
                if(!visited[nx][ny] && painting[nx][ny].equals(painting[x][y])) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void colorWeakness() {
        for(int i=0; i<painting.length; i++) {
            for(int j=0; j<painting.length; j++) {
                if(painting[i][j].equals("G")) {
                    painting[i][j] = "R";
                }
            }
        }
    }
}
