package com.knoldus.api

class StringFunctions {
    def reverseString(str:String):String={
      var reversedStr:String = ""

      for(i<-0 to str.length()){
        reversedStr +=  str(str.length-1-i).toString
      }
      reversedStr
    }
    def stringLength(str:String):Int={
      str.length
    }

}
