class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int maxLen = 0;
        int n = s.length();
        Set<Character> map = new HashSet<>();

        for(int high = 0; high<n; high++){

            while(map.contains(s.charAt(high))){
                map.remove(s.charAt(low));
                low++;
            }

            map.add(s.charAt(high));
            maxLen = Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}