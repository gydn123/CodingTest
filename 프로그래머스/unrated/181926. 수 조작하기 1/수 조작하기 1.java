class Solution {
    public int solution(int n, String control) {
        
        //control == 'wasd'
        //w = -1 , s = -1, d = +10, a = -10
        
        for(int i=0; i<control.length(); i++){
            if(control.charAt(i) == 'w'){
                n +=1;
            }else if(control.charAt(i) == 's'){
                n -=1;
            }else if(control.charAt(i) == 'd'){
                n +=10;
            }else if(control.charAt(i) == 'a'){
                n -=10;
            }
        }
        
        return n;
    }
}