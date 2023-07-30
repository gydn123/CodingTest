class Solution {
    public int solution(int number, int n, int m) {       
        int test1 = number%n;
        int test2 = number%m;
        
        if(test1 == 0 && test2 == 0){
            if(test1%m == 0 && test2%n == 0){
                return 1 ;
            }
        }
        return 0 ;    
    }
}