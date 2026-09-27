class Solution {
    public int maxRepeating(String sequence, String word) {
        int seqLen = sequence.length();
        int wordLen = word.length();
        int [] dp = new int[seqLen+1];
        int max = 0;
        for(int i=wordLen; i<=seqLen; i++){
            if(sequence.substring(i-wordLen, i).equals(word)) {
                dp[i] = dp[i-wordLen] + 1;
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}