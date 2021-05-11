package com.knoldus.impl
import com.knoldus.api

class Impl{
 def main():Unit={
   val obj:StringFunctions=new StringFunctions()
   val str:String="abcdef"
   println("String length is "+obj.stringLength(str)+" and its reverse String is "+obj.reverseString(str))
 }
}
