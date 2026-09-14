class Solution {
    public boolean containsDuplicate(int[] nums) {
      // create a hashset to store integers 
      Set<Integer> intSet = new HashSet<>();

      //Iterate over each element 
      for (int num : nums) {

        //Check the number in hashset
        if(intSet.contains(num))
        return true;

        //Add the numeber to hashset
        intSet.add(num);
      }  
      return false;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna