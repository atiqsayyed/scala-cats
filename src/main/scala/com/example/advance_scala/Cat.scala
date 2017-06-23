package com.example.advance_scala
final case class Cat(name: String, age: Int, color: String)

object Boot extends App {
  implicit val printablecat = Show.show[Cat] { cat =>
    val name = Printable.format(cat.name)
    val age = Printable.format(cat.age)
    val color = Printable.format(cat.color)
    s"$name is a $age year-old $color cat"
  }

  implicit val equalityInstance = Eq.instance[Cat] { (cat1, cat2) =>
    {
      (cat1.name === cat2.name && cat1.age === cat2.age && cat1.color == cat2.color)
    }
  }

  val cat1 = Cat("Garfield", 35, "orange and black")
  val cat2 = Cat("Heathcliff", 30, "orange and black")
  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]

  println(optionCat1 === optionCat1)
}
