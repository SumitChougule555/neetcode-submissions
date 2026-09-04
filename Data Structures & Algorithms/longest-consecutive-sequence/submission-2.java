class Solution {
    public int longestConsecutive(int[] nums) {
       int longestlength = 0;
       Map<Integer,Boolean> map = new HashMap <> ();
       for (int num:nums){
        map.put(num,Boolean.FALSE);
       } 
       for (int num:nums){
        int currentlength= 1;

       int NextNum= num + 1;
       while(map.containsKey(NextNum) && map.get(NextNum)== Boolean.FALSE){
        currentlength++;
        map.put(NextNum,Boolean.TRUE);
        NextNum++;
       }
       int Prenum= num-1;
       while(map.containsKey(Prenum) && !map.get(Prenum)){
        currentlength++;
        map.put(Prenum,Boolean.TRUE);
       Prenum--;
       }
       longestlength = Math.max(longestlength,currentlength);
       }

     return longestlength;
    }
}
