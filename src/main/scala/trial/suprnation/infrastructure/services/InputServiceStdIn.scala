package trial.suprnation.infrastructure.services

import trial.suprnation.domain.services.InputService

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object InputServiceStdIn extends InputService {

  override def readInput(): List[List[Int]] = {
    var lineReaded: String = StdIn.readLine()

    var lines = new ListBuffer[List[Int]]

    def numbersInString(str: String): List[Int] = {
      ("""\d+""".r findAllIn str).toList.map(x => x.toInt)
    }

    while(lineReaded != null) {
      val newLine: List[Int] = numbersInString(lineReaded)
      lines += newLine
      lineReaded = StdIn.readLine()
    }

    lines.toList
  }

  override def validateInput(triangle: List[List[Int]]): Boolean = {

    def isTriangleComplete(triangle: List[List[Int]]): Boolean = {
      var validation: Boolean = true
      for(i <- 1 to triangle.size) {
        validation &= triangle(i - 1).size == i
      }
      validation
    }

    if(triangle.head.size != 1) {
      println("First line must contains exactly 1 number")
      false
    } else if(!isTriangleComplete(triangle)) {
      println("The triangle must be complete")
      false
    } else {
      true
    }
  }
}
