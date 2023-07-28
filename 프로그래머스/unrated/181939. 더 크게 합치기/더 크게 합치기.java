class Solution {
    public int solution(int a, int b) {
        
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
            
        // StringBuilder test1 = new StringBuilder();
        // StringBuilder test2 = new StringBuilder();
        
        String test3 = sa + sb;
        String test4 = sb + sa;
        
        // test1 = sa.append(sb);
        // test2 = sb.append(sa);
        
        int test1 = Integer.parseInt(test3);
        int test2 = Integer.parseInt(test4);
        
        if(test1 > test2){
            return test1;
        }else{
            return test2;
        }
        
        
    }
}