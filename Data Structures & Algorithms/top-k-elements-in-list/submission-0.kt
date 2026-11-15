class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
      val count = hashMapOf<Int,Int>()
      val freq = Array<MutableList<Int>>(nums.size+1){mutableListOf()}
      for(num in nums){
        count[num] = (count[num]?:0)+1
      }
      for((num,c) in count){
        freq[c].add(num)
      }
      val result = IntArray(k)
      var dx = 0
      for(f in nums.size downTo 1){
        for(num in freq[f]){
            result[dx++] = num
            if(dx==k) return result
        }
      }
      return result
    }
}
