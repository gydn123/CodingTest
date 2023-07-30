class Solution {
    public int solution(int n) {
        int odd = 0;
        int even = 0;
        if(n%2 == 1){
            for(int i=1; i<=n; i++){
                if(i%2 == 1){
                    odd += i;
                }                 
            } return odd;
        }else {
            for(int i=1; i<=n; i++){
                if(i%2 == 0){
                    even += i*i;
                }
            }
        } return even;
        
    }
}