import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayDeque<Integer> deque;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), "[],");
            deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) deque.add(Integer.parseInt(st.nextToken()));
            AC(command, deque);
        }
        br.close();
        System.out.print(sb);
    }

    public static void AC(String command, ArrayDeque<Integer> deque) {
        boolean isReverse = false;

        for (char cmd : command.toCharArray()) {
            if (cmd == 'R') {
                isReverse = !isReverse;
                continue;
            }

            if (isReverse){
                if (deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
            else {
                if (deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }
        printString(deque, isReverse);
    }

    public static void printString(ArrayDeque<Integer> deque, boolean isReverse) {
        sb.append('[');
        while (!deque.isEmpty()) {
            sb.append(isReverse ? deque.removeLast() : deque.removeFirst());
            if (!deque.isEmpty()) sb.append(',');
        }
        sb.append("]\n");
    }
}
