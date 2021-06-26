
object CodingPracticeLife {
  def main(args: Array[String]): Unit = {
    println("hello practice")


    val str=new StringClass
    val arr=new ArrayClass

    str.printMyName("Kanupriya")
    println("minimum element "+arr.minOfArray(Array(1,2,3,4,55,6000)))
    println(arr.maxOfArray(Array(1,2,3,4,55,6000)))
    println(str.optimisedcheckBalancedString("((()))","()"))

  }


}
