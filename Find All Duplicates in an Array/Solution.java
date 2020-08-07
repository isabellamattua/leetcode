class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        int value , index;
        for (int position = 0 ; position < nums.length ; position++){
            value = Math.abs(nums[position]);
            index = value -1 ;

            if ( nums[index] < 0){
                answer.add(value);
            }
            nums[index] *=-1;
        }




        return answer;
    }
}
