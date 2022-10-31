import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeNumSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        String s = br.readLine();
        br.close();
        StringTokenizer st = new StringTokenizer(s);

        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i] + " ");
        }
    }
}