class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1; i<=s.length(); i++){
            for(String w: wordDict){
                int len = w.length();
                if(i >= len && dp[i-len] && s.substring(i-len, i).equals(w)){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}