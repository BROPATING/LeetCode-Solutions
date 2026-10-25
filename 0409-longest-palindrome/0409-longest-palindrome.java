class Solution {
    public int longestPalindrome(String s) {
        int [] freq = new int[128];
        int even = 0;
        int odd = 0;
        boolean hasOdd = false;
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }
        for(int n: freq){
            if (n != 0 && (n % 2 == 0)) {
                even += n;
            } else if(n != 0){
                odd += n-1;
                hasOdd = true;
            }
        }
        if(hasOdd) return even+odd+1;
        return even;
    }
}