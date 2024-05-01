class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int rs[] = new int[3];
        
        String numstr = "";
        int idx = 0;
        
        for (char c : dartResult.toCharArray()) {
            
            if(c >= '0' && c <= '9'){       
                 numstr += String.valueOf(c);
            }
        
            else if(c == 'S' || c == 'D' || c == 'T'){
                int n = Integer.parseInt(numstr);
                
                if(c == 'S') {
                   rs[idx++] = (int) Math.pow(n,1);
                }
                
                else if(c == 'D') {
                    rs[idx++] = (int) Math.pow(n,2);
                }
                
                else{
                    rs[idx++] = (int) Math.pow(n,3);
                } 
                numstr="";
            }
            
            else {
                if (c == '*') {
                    rs[idx - 1] = rs[idx - 1] * 2;
                    if (idx - 2 >= 0) rs[idx - 2] *= 2;
                } else {
                    rs[idx - 1] = rs[idx - 1] * -1;
                }
            }
        }
        
        answer = rs[0] + rs[1] + rs[2];
        
        return answer;
    }
}