package com.example.advance_scala

/**
  * Created by asayyed on 6/20/17.
  */
object MonoidExample extends App {

  case class Order(totalCost: Double, quantity: Double)

  implicit val orderMonoid = new Monoid[Order] {

    override def combine(x: Order, y: Order): Order =
      Order(x.totalCost + y.totalCost, x.quantity + y.quantity)

    override def empty: Order = Order(0,0)
  }

  def monoidAddtion = {
    def add[A](integer: List[A])(implicit monoid: Monoid[A]) =
      integer.foldLeft(monoid.empty)(_ |+| _)

    println(add(List(Order(1,1),Order(1,1),Order(1,1))))
  }


  monoidAddtion

}
