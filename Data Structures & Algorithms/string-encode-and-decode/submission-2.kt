class Solution {

    fun encode(strs: List<String>): String {
      val result = StringBuilder() 
      strs.forEach{
        result.append("${it.length}").append("#").append("${it}")
      }
      return result.toString()
    }

    fun decode(str: String): List<String> {
      val result = mutableListOf<String>()
      var i = 0
      while(i<str.length){
        val hashIndex =  str.indexOf("#",i)
        val len = str.substring(i,hashIndex).toInt()
        val start = hashIndex+1
        val end = start+len
        result.add(str.substring(start, end))
        i = end
      }
      return result
    }
}
