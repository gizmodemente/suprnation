package trial.suprnation.domain.services

import trial.suprnation.domain.model.Path

trait PathService {
  def calculatePath(triangleList: List[List[Int]]): Path
}
