class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.getFirst().getFirst();
        int max = arrays.getFirst().getLast();
        int maxDist = 0;
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> row = arrays.get(i);
            int crrMin = row.getFirst();
            int crrMax = row.getLast();

            maxDist = Math.max(maxDist, Math.max(Math.abs(crrMax - min), Math.abs(max - crrMin)));

            min = Math.min(min, crrMin);
            max = Math.max(max, crrMax);

        }
        return maxDist;
    }
}