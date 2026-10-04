class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(1);
        ls.add(1);

        while(true){
            int next = ls.get(ls.size() - 1) + ls.get(ls.size() - 2);
            if(next > k) break;
            ls.add(next);
        }

        int count = 0;
        int i = ls.size()-1;
        while(k > 0){
            if(k >= ls.get(i)) {
                k -= ls.get(i);
                count++;
            }
            i--;
        }

        return count;
    }
}