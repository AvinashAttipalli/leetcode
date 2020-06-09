package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
	
	 public int majorityElement(int[] nums) {
	        
	        int majorityEleSize = nums.length/2;

	        Map<Integer, Integer> elementRanking = new HashMap<>();
	        
	        for(int i =0; i<nums.length; i++){
	            
	            if(!elementRanking.containsKey(nums[i])){
	                int count = 1;
	                elementRanking.put(nums[i], count);
	            }else{
	                int count = elementRanking.get(nums[i])+1;
	                elementRanking.replace(nums[i], count);
	            }
	            
	            if(elementRanking.get(nums[i]) > majorityEleSize){
	                return nums[i];
	            }
	        }
	      return 0;  
	    }

}
