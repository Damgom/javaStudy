import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int A = 0;
        int B = 0;
        int C = 0;

        if(T % 10 != 0) {
            System.out.println(-1);
        }
        else{
            A = T / 300;
            T %= 300;
            B = T / 60;
            T %= 60;
            C = T / 10;
            System.out.println(A + " " + B + " " + C);
        }
    }
}