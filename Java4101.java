import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            if (fir == 0 && sec == 0) {
                break;
            }

            if (fir > sec) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
