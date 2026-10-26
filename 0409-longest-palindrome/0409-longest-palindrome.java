class Solution {
    public int longestPalindrome_FreqMap(String s) {
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

    public int longestPalindrome_HashMap(String str){
        int even = 0;
        int odd = 0;
        boolean hasOdd = false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int v: hm.values()) {
            if(v % 2 == 0) even += v;
            else {
                odd += v - 1;
                hasOdd = true;
            }
        }
        if(hasOdd) return even + odd +1;
        return even;
    }
}
