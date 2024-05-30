import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            solution(queue, n, m);
        }
        System.out.print(sb);
    }

    public static void solution(LinkedList<int[]> queue, int n, int m) {
        int cnt = 0;
        while (true) {
            int[] now = queue.poll();
            boolean isMax = true;
            for (int[] q: queue) {
                if (now[1] < q[1]) {
                    queue.offer(now);
                    isMax = false;
                    break;
                }
            }
            if (!isMax) continue;
            cnt++;
            if (now[0] == m) break;
        }
        sb.append(cnt).append("\n");
    }
}
