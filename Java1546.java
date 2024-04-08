import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        double sum = 0.0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        for (int i=0; i<n; i++){
            int value = Integer.parseInt(st.nextToken());

            if (value > max) max = value;
            sum += value;
        }
        System.out.println(((sum/max)*100)/n);
    }
}
