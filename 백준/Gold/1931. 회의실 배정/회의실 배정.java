import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스의 개수 T
        int T = sc.nextInt();

        List<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i < T; i++) {
            // nextInt() 다음에 next()를 쓰면 엔터키 문제를 신경쓰지 않아도 됨
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();
            list.add(new int[]{startTime, endTime});
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        if (T == 0) {
            sc.close();
            return;
        }

        int count = 1;
        int previousEndTime = list.get(0)[1]; // 첫번째 회의의 종료시간

        // 두번 째 회의부터 순회
        for (int i = 1; i < T; i++) {
            int currentStartTime = list.get(i)[0]; // 현재 회의의 시작 시간

            // 현재 회의의 시작 시간이 이전 회의의 종료 시간보다 크거나 같으면\
            if(currentStartTime >= previousEndTime) {
                count++;
                previousEndTime = list.get(i)[1]; // 종료 시간을 현재 회의의 종료 시간으로 업데이트
            }
        }

        System.out.println(count);

        sc.close();
    }

}