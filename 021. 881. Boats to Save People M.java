// Problem link - https://leetcode.com/problems/boats-to-save-people/ 

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int number_of_boats = 0;
        int i = 0;
        int j = people.length - 1;
        
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
            
            number_of_boats++;
        }
        
        return number_of_boats;
        
    }
}
