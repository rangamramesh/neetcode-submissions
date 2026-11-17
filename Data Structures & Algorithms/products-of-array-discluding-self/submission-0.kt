class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
     val result =  IntArray(nums.size)
     var prefix = 1
     for(i in nums.indices){
        result[i] = prefix
        prefix *= nums[i] 
     }
    var postfix = 1
     for(j in nums.lastIndex downTo 0){
        result[j] *=postfix
        postfix *=nums[j]
     }
     return result
}

}
