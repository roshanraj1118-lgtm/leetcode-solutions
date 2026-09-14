class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
         if(s1 != t1){
            return false;

         }
         int[] arr = new int[26];
         for(int i = 0; i< s.length(); i++){
            arr[s.charAt(i) - 'a']++;
         }
         for(int i = 0; i< t.length(); i++){
            arr[t.charAt(i) - 'a']--;
            if(arr[t.charAt(i) - 'a'] <0){
                return false;
            }
            }
            return true;
         }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna