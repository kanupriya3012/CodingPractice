class ArrayClass {

  //having i+1 in array,list , you will be doomed , don't use i+1
  //think from complexity perspective , take a variable and update that based on condition
  def maxOfArray(arr:Array[Int]):Int={
    var fixVar=arr(0)
    for(i<-1 to arr.length-1){
      if(arr(i)>fixVar){
        fixVar=arr(i)
      }
    }
    return(fixVar)
  }

  def minOfArray(arr:Array[Int]):Int={
    var fixVar=arr(0)
    for(i<-1 to arr.length-1){
      if(arr(i)<fixVar){
        fixVar=arr(i)
      }
    }
    return(fixVar)
  }

  def sharesProfitCalculator(arr:Array[Int]):Int{
    var minvar=minOfArray(arr)
    var counter=0
    for(i<-0 to arr.length-1){

    if(arr(i)-minvar>counter and ){
    counter=arr(i)-minvar
  }

  }

  }

}
