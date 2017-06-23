//trait Semigroup[A] {
//  def combine(x: A, y: A): A
//}
//
//trait Monoid[A] extends Semigroup[A] {
//  def empty: A
//}
//
//object Monoid {
//  def apply[A](implicit monoid: Monoid[A]) = {
//    monoid
//  }
//}
//
//implicit val booleanAndMonoid = new Monoid[Boolean] {
//  override def empty: Boolean = true
//
//  override def combine(x: Boolean, y: Boolean): Boolean = x & y
//}
//implicit val booleanOrMonoid = new Monoid[Boolean] {
//  override def empty: Boolean = false
//
//  override def combine(x: Boolean, y: Boolean): Boolean = x || y
//}
def add(items: List[Int]): Int =
  items.foldLeft(Monoid[Int].empty)(_ |+| _)