class Solution {
    public int solution(int a, int b) {
        int intsum = Integer.parseInt(""+a+b);
        
        int intmul = 2*a*b;
        
        return intsum > intmul ? intsum : intmul;
    }
}