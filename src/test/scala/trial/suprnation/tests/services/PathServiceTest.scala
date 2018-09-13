package trial.suprnation.tests.services

import org.scalatest.FlatSpec
import trial.suprnation.domain.model.Path
import trial.suprnation.infrastructure.services.PathServiceInt

class PathServiceTest extends FlatSpec {

  "A path service" must "return a minimum path" in {

    val triangleList: List[List[Int]] = List(List(1), List(2,3), List(6,5,4))

    val path: Path = PathServiceInt.calculatePath(triangleList)

    assert(path.total == 8)
    assert(path.path.equals(List(1,2,5)))
  }

  "A path service" must "supports enough load" in {

    val r = scala.util.Random
    val triangleList: List[List[Int]] = (for (x <- 1 to 30) yield List.fill(x)(r.nextInt(1000))).toList

    val path: Path = PathServiceInt.calculatePath(triangleList)

    assert(path.total > 0)
  }
}
