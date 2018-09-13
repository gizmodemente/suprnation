package trial.suprnation.infrastructure.services

import trial.suprnation.domain.model.{Path, Triangle}
import trial.suprnation.domain.services.PathService

object PathServiceInt extends PathService {

  override def calculatePath(triangleList: List[List[Int]]): Path = {

    def makeTriangle(lists: List[List[Int]]): List[Triangle] = {
      lists match  {
        case Nil => Nil
        case x :: Nil => x.map(x => Triangle(x, None, None))
        case x :: y => (x zip makeTriangle(y).sliding(2).toList).map(x => Triangle(x._1, Some(x._2.head), Some(x._2.last)))
      }
    }

    val triangle = makeTriangle(triangleList).head

    def calculateMinimumPath(triangle: Option[Triangle]): Path = {
      triangle match {
        case None =>
          Path(0, List.empty)
        case Some(node) =>
          val leftPath = calculateMinimumPath(node.left)
          val rightPath = calculateMinimumPath(node.right)
          val selectedPath = if (leftPath.total <= rightPath.total) leftPath else rightPath
          Path(selectedPath.total + node.value, node.value :: selectedPath.path)
      }
    }

    calculateMinimumPath(Some(triangle))
  }
}
