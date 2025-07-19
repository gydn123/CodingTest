import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

       int[][] paper = new int[100][100];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 검은색 색종이 갯수
        int n = Integer.parseInt(br.readLine());

        // 종이의 간격 정보 입력받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            /**
             * 수학 좌표계의 x,y는 x-> 가로 (좌우) y -> 세로 (상하)
             * 2차원 배열 [행][열] 첫번째 인덱스 [행] -> 세로, 두번째 인덱스 [열] 가로
             * 즉, 수학 좌표 x,y는 2차원 배열에서 [y][x]로 들어와야 맞는 값이 됨             *
              */

            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int blackArea = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                blackArea += paper[i][j];
            }
        }

        System.out.println(blackArea);
    }

}