import java.util.*

fun main() {
  println(
    isPalindrome("zura aruz")
  )
  println(
    evenAverage(listOf<Int>(1, 2, 3, 4, 5, 6, 7))
  )
}

fun isPalindrome(str: String): Boolean {
  var l = 0
  var h: Int = str.length - 1
  var string = str
  string = str.lowercase(Locale.getDefault())


  while (l <= h) {
    val getAtl: Char = string[l]
    val getAth: Char = string[h]

    if (getAtl !in 'a'..'z') l++ else if (getAth !in 'a'..'z') h-- else if (getAtl == getAth) {
      l++
      h--
    } else return false
  }
  return true
}


fun evenAverage(arr: List<Int>): Int {
  var sum: Int = 0
  for ((index, value) in arr.withIndex()) {
    if (index % 2 == 0) {
      sum += value
    }
  }
  return sum / arr.size;
}




