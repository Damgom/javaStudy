import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        StringTokenizer st = new StringTokenizer(s);

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B && B == C){
            System.out.println(10000 + A * 1000);
        }
        else if(A == B || A == C){
            System.out.println(1000 + A * 100);
        }
        else if(B == C){
            System.out.println(1000 + B * 100);
        }
        else System.out.println(Math.max(A, Math.max(B,C)) * 100);
    }
}