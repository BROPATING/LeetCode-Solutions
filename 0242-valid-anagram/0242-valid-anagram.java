class Solution {
    
    public boolean isAnagram_1(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: s.toCharArray()) hm.put(ch, hm.getOrDefault(ch, 0)+1);
        for(char ch: t.toCharArray()){
            if(!hm.containsKey(ch)) return false;
            hm.put(ch, hm.get(ch)-1);
            if(hm.get(ch) < 0) return false;
        }
        return true;
    }
    
    public boolean isAnagram_2(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count: freq){
            if(count != 0) return false;
        }
        return true;
    }

     public static boolean validAnagram_3(String s, String t){
        if(s.length() != t.length()) return false;
        char [] sChar = s.toCharArray();
        char [] tChar =  t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }
}
