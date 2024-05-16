import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        int last = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.remove()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (!queue.isEmpty()) {
                        sb.append(0).append("\n");
                    } else sb.append(1).append("\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        sb.append(queue.peek()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        sb.append(last).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}
