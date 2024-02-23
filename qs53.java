public class qs53 {

        public int maxSubArray(int[] nums) {
            int cursum = 0;
            int maxsum = nums[0];


            if(nums.length == 1){
                return nums[0];
            }

            for(int i = 0; i < nums.length; i++){
                cursum += nums[i];
                if(maxsum < cursum){
                    maxsum = cursum;
                }

                if(cursum < 0){
                    cursum = 0;

                }



            }

            return maxsum;
        }

}
