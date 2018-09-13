package trial.suprnation.infrastructure.services

import trial.suprnation.domain.model.Path
import trial.suprnation.domain.services.PathService

object PathServiceInt extends PathService {

  override def calculatePath(triangleList: List[List[Int]]): Path = {

    def calculateMinPath(tree: List[List[Int]]): List[Path] = {
      tree match {
        case Nil => List.empty
        case x :: Nil => x.sliding(2).map(node => node.min).map(node => Path(node, List(node))).toList
        case x :: y => (x zip calculateMinPath(y)).map(pair => Path(pair._1 + pair._2.total, pair._1 :: pair._2.path)).
          sliding(2).map(pair => if(pair.head.total <= pair.last.total) pair.head else pair.last).toList
      }
    }

    calculateMinPath(triangleList).head
  }
}
