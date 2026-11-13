class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      val verifier = hashMapOf<Int,Int>()
      for(index in nums.indices){
        val diff = target-nums[index]
        if(verifier.containsKey(diff)){
          return intArrayOf(verifier[diff]!!, index)
        }
        verifier[nums[index]] = index
      }
      return intArrayOf()
    }
}
