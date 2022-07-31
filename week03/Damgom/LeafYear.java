import java.io.*;

//백준 2753 윤년
public class LeafYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        if(N % 4 == 0 && N % 100 != 0) bw.write("1");
        else if(N % 400 == 0) bw.write("1");
        else bw.write("0");
        bw.close();
    }
}