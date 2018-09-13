package trial.suprnation

import trial.suprnation.infrastructure.services.{InputServiceStdIn, PathServiceInt}

object MinimumPathApp {

  def main(args: Array[String]): Unit = {

    val triangle: List[List[Int]] = InputServiceStdIn.readInput()

    if(InputServiceStdIn.validateInput(triangle)) {
      val path = PathServiceInt.calculatePath(triangle)
      println("Minimal path is: " + path.path.mkString(" + ") + s" = ${path.total}")
    }
  }
}