package com.example.advance_scala

/**
  * Created by asayyed on 6/22/17.
  */
object Temp extends App{
 val f = (x:Int) => x *2
 val g = (x:Int) => x.toString

  println(f andThen g)

 List(1).lift

}
