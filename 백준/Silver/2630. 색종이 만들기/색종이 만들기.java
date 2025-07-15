import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    public static int[][] paper;
    public static int whiteCount = 0;
    public static int blueCount = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 종이의 한 변의 길이 N입력
        int n = Integer.parseInt(br.readLine());

        // N x N 크기의 배열 초기화
        paper = new int[n][n];

        // 종이의 색상 정보 입력받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // (0,0) 좌표에서 시작하는 N x N 크기의 종이에 대해 함수 실행
        solve(0, 0, n);

        // 결과 출력
        System.out.println(whiteCount);
        System.out.println(blueCount);
    }    

    public static void solve(int row, int col,int size) {

        // 현재 영역의 색상이 모두 같은지 확인
        if (isColorSame(row, col, size)) {
            // 시작점의 색상에 따라 카운트 증가
            if (paper[row][col] == 0) {
                whiteCount++;
            } else {
                blueCount++;
            }
            return;
        }

        // 색상이 같지 않으면 4등분하여 재귀 호출
        int newSize = size / 2;

        solve(row, col, newSize);                           // 1사분면 (좌상단)
        solve(row, col + newSize, newSize);                 // 2사분면 (우상단)
        solve(row + newSize, col, newSize);                 // 3사분면 (좌하단)
        solve(row + newSize, col + newSize, newSize);       // 4사분면 (우하단)
    }

    public static boolean isColorSame(int row, int col, int size) {
        int color = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if(paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

}