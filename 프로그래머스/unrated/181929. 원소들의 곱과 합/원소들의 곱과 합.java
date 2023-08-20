class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i]; // 누적합 계산
            mul *= num_list[i]; // 누적곱 계산
        }
        sum = sum * sum;
        
        if(sum > mul){
            return 1;
        }

        return 0;
    }
}
