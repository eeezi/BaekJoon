import java.io.*;
import java.util.*;

public class Main {
    public static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        for (int i = 0; i < n; i++) {
            countDecimal(Integer.parseInt(st.nextToken()));
        }
        System.out.print(count);
    }

    public static void countDecimal(int num) {
        if (num == 1) return;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) return;
        }
        count++;
    }
}
