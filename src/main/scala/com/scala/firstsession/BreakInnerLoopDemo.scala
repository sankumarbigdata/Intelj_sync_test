package com.scala.firstsession
import util.control.Breaks._
object BreakInnerLoopDemo {

    def main(args: Array[String]): Unit = {
      println("Break")
      for( i <- 1 to 5 ){
        breakable {
          for (j <- 1 to 3) {
            if (i == 3 && j == 0) break
            println("inner loop i - " + i + " :  j - " + j)
            if(i==4) break
          }
        }
        println("I am out of break")
      }
      println("out of main")
    }

}
