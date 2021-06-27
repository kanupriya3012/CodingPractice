class StringClass {

  def printMyName(name:String)={
    println(s"Developer's name is ${name}")
  }

  //only one variable helped, again use same variable updation, instead of 2 variable approach
  def optimisedcheckBalancedString(str:String,paranthesis:String):String={
    var cnt =0
    for (i<-0 to str.length-1){
      if(str.charAt(i)==paranthesis(0)){
        cnt=1
      }
      else if (str.charAt(i)==paranthesis(1)){
        cnt-=1
      }
    }
    if(cnt==0){return("matched")}
    else{return ("not matched")}

  }

  def checkBalancedString(str:String,paranthesis:String):String={
    var cnt1=0
    var cnt2=0
    var invalidCnt=0
    for (i<-0 to str.length-1){

      if(str.charAt(i)==paranthesis(0)){
        cnt1+=1
      }
      else if (str.charAt(i)==paranthesis(1)){
        cnt2+=1
      }
      else{
        invalidCnt+=1

      }
    }

    cnt1==cnt2 match {
      case true => return("matched")
      case false =>return ("not matched")

    }


  }

}
