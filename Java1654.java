import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cable = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            cable[i] = Integer.parseInt(br.readLine());
            if (max < cable[i]) {
                max = cable[i];
            }
        }
        br.close();

        max++;
        long min = 0;
        long mid = 0;

        while (min < max) {
            long count = 0;
            mid = (max + min) / 2;

            for (int i = 0; i < k; i++) {
                count += cable[i] / mid;
            }

            if (count < n) max = mid;
            else min = mid + 1;
        }
        System.out.print(min - 1);
    }
}
