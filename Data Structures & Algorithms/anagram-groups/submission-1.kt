class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
      val result = hashMapOf<String,MutableList<String>>()

      for(str in strs){
        val count = IntArray(26)
        for(s in str){
            count[s-'a']++
        }
        val key = count.joinToString("#")

        result.getOrPut(key){mutableListOf()}.add(str)
      }
      return result.values.toList()
    }

   
}
