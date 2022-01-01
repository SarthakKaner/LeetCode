class Solution {
    public List<Integer> majorityElement(int[] nums) {  
        int n = nums.length;
        int count1 = 0, count2 = 0, element1 = -1, element2 = -1;
       
        for(int i = 0; i < n;i++){
           
            if(element1 == nums[i]){
                count1++;
               
            }
            else if(element2 == nums[i]){
                count2++;
               
            }
            else  if(count1 == 0){
                element1 = nums[i];
                 count1 = 1;
            }
            else if(count2 == 0){
                element2 = nums[i];
                 count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        count1= 0;
        count2=0;
        
        for(int i=0; i < n;i++){
            if(element1 == nums[i]){
                count1++;
            }
            else if(element2 == nums[i]){
                count2++;
            }
        }
        
        if(element1==element2){
            count2=0;
        }
    
            if(count1 > n/3){
                list.add(element1);
            }
            
            if(count2 > n/3){
                list.add(element2);
            }
        return list;
      
    }
}

// Using HashMap


//  HashMap<Integer,Integer> map = new HashMap();
//         int n = nums.length;
        
//         for(int i = 0; i < nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i],map.get(nums[i])+1);
//             }else{
//                 map.put(nums[i],1);
//             }
//         }+
        
//         ArrayList<Integer> list =  new ArrayList();
//          for (Map.Entry mapElement : map.entrySet()){
//              if((int)mapElement.getValue() >  n/3){
//                  list.add((int)mapElement.getKey());
//              }
//          }
//         return list;
