import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push_front":
                    dequeue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dequeue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.pollFirst()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case "pop_back":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.pollLast()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(dequeue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(dequeue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.peekFirst()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case "back":
                    if (!dequeue.isEmpty()) {
                        sb.append(dequeue.peekLast()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}
