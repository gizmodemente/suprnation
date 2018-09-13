package trial.suprnation.tests.services

import org.scalatest.FlatSpec
import trial.suprnation.infrastructure.services.InputServiceStdIn

class InputServiceTest extends FlatSpec {

  "A triangle" must "have a root" in {

    val triangleComplete: List[List[Int]] = List(List(1), List(2,3), List(6,5,4))

    assert(InputServiceStdIn.validateInput(triangleComplete))

    assert(!InputServiceStdIn.validateInput(List(List(2,3))))
  }

  "A triangle" must "be complete" in {

    val triangleInComplete: List[List[Int]] = List(List(1), List(2), List(6,5,4))
    val triangleInCompleteWithEmptyList: List[List[Int]] = List(List(1), List(2), List(6,5,4))

    assert(!InputServiceStdIn.validateInput(triangleInComplete))

    assert(!InputServiceStdIn.validateInput(triangleInCompleteWithEmptyList))
  }
}
