class Solution {
    public boolean solution(int x) {
        int hi = 0;
        
        String s = String.valueOf(x);
        String[] split = s.split("");
        
        for (String l : split) {
            hi += Integer.parseInt(l);
        }
        
        return x % hi == 0;
    }
}