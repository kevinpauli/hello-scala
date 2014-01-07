package greeter

object HelloWorksheet {
  val x = 1                                       //> x  : Int = 1
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 2
  x                                               //> res1: Int = 1
  increase(x)                                     //> res2: Int = 2
  1+1                                             //> res3: Int(2) = 2
  2+2                                             //> res4: Int(4) = 4
}