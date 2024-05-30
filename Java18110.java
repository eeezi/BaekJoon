import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int round = (int) Math.round(n * 0.15);

        int[] opinions = new int[n];
        for (int i = 0; i < n; i++) opinions[i] = Integer.parseInt(br.readLine());
        br.close();
        Arrays.sort(opinions);

        double sum = 0.0;
        for (int i = round; i < n-round; i++) sum += opinions[i];
        System.out.print(Math.round(sum / (n - 2 * round)));
    }
}
