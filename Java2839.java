import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = -1;

        if (n%5 == 0) answer = n/5;

        for (int i = 1; i * 5 <= n; i++) {
            int x = n - (i * 5);
            if (x % 3 == 0) answer = i + (x / 3);
        }

        if (n%3 == 0 && answer == -1) answer = n / 3;

        System.out.print(answer);
    }
}
