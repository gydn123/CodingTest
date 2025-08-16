import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 T
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[31][31];

        for (int i = 0; i < 31; i++) {
            dp[i][0] = 1;
            dp[i][1] = 1;
        }

        for (int i = 2; i < 31; i++) {
            for (int j = 1; j < 31; j++) {
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 왼쪽 사이트 갯수 N
            int N = Integer.parseInt(st.nextToken());

            // 오른쪽 사이트 갯수 M
            int M = Integer.parseInt(st.nextToken());
            sb.append(dp[M][N]).append("\n");
        }
        System.out.println(sb);
    }

}