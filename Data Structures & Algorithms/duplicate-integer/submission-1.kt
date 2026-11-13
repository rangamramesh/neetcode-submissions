class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
     val seen = mutableSetOf<Int>()
     nums.forEach {
      if(seen.contains(it)) return true
      seen.add(it)
     }
      return false
    }
}
