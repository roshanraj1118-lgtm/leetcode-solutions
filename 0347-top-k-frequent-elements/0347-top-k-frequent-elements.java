class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+ 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int num : freq.keySet()){
            int f = freq.get(num);
            if(buckets[f] == null){
                buckets[f]= new ArrayList<>();

            }
            buckets[f].add(num);

           }
                    int[] result = new  int[k];
                    int index = 0;

                       for (int f = buckets.length - 1; f >= 0 && index < k; f--) {
            if (buckets[f] != null) {
                for (int num : buckets[f]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
         }
    }
            }
}   

return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna