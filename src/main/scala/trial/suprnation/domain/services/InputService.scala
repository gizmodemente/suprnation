package trial.suprnation.domain.services

trait InputService {
  def readInput(): List[List[Int]]
  def validateInput(triangle: List[List[Int]]): Boolean
}
