package com.scala.firstsession
import util.control.Breaks._
object BreakDemo {

    def main(args: Array[String]): Unit = {
    println("Break")
      breakable{
        for( i <- 1 to 5 ){
          println("i value"+ i)
          if(i%2==0){
            break
          }else println("I am out of break")
        }
      }
  }
  println("i am out of break")
}
