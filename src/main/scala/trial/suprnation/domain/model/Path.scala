package trial.suprnation.domain.model

case class Path(total: Int, path: List[Int])
case class Triangle(value: Int, left: Option[Triangle], right: Option[Triangle])