//https://leetcode.com/problems/majority-element-ii/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0 , ele1 = Integer.MIN_VALUE;
        int cnt2=0 , ele2 = Integer.MIN_VALUE;
        LinkedList<Integer> l = new LinkedList<>();
        for( int i =0; i < nums.length; i ++){
            if(cnt1 == 0 && nums[i]!=ele2){
                ele1 = nums[i];
                cnt1 += 1;
            }
            else if(cnt2 == 0 && nums[i]!=ele1){
                ele2 = nums[i];
                cnt2+=1;
            }
            else if(nums[i]==ele1){
                cnt1 += 1;
            }
            else if(nums[i]==ele2){
                cnt2 += 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int one =0,two=0;
        for( int i =0; i < nums.length; i ++){
            if(nums[i] == ele1){
                one++;
            }
            if(nums[i] == ele2){
                two++;
            }
        }
        if(one >= ((int)(nums.length/3)+1)){
            l.add(ele1);
        }
        if(two >= ((int)(nums.length/3)+1)){
            l.add(ele2);
        }
        return l;
    }
}
