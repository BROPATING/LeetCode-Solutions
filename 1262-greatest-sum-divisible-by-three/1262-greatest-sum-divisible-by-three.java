class Solution {
    public int maxSumDivThree(int[] nums) {
        int maxSum = 0;
        int [] rem1 = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int [] rem2 = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int n : nums){
            maxSum += n;
            if  (n % 3 == 1){
                if (n < rem1[0]){
                    rem1[1] = rem1[0];
                    rem1[0] = n;
                } else if (n < rem1[1]) {
                    rem1[1] = n;
                }
            } else if (n % 3 == 2) {
                if(n < rem2[0]){
                    rem2[1] = rem2[0];
                    rem2[0] = n;
                } else if (n < rem2[1]) {
                    rem2[1] = n;
                }
            }
        }
        if (maxSum % 3 == 0) return maxSum;
        if (maxSum % 3 == 1) {
            int remove1 = rem1[0]; 
            int remove2 = (rem2[0] != Integer.MAX_VALUE && rem2[1] != Integer.MAX_VALUE) ? rem2[0] + rem2[1] : Integer.MAX_VALUE; 
            return maxSum - Math.min(remove1, remove2);
        }
        int remove1 = rem2[0];
        int remove2 = (rem1[0] != Integer.MAX_VALUE && rem1[1] != Integer.MAX_VALUE) ? rem1[0] + rem1[1] : Integer.MAX_VALUE;
        return maxSum - Math.min(remove1, remove2);
    }
}