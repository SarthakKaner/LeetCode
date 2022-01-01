// Moore's voting algorithm

class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0,ele = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(count == 0){
                ele = nums[i];
            }
            if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}


// Using HashMap


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Integer key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
