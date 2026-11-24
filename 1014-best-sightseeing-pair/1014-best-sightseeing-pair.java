class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int len = values.length;
        int res = Integer.MIN_VALUE;
        int bestLeft = values[0];
        for(int i=1; i<len; i++){
            res = Math.max(res, bestLeft + values[i] - i);
            bestLeft = Math.max(bestLeft, values[i] + i);
        }
        return res;
    }
}