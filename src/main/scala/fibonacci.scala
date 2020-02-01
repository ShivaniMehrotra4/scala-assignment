object Fibonacci extends App
{
  def fibonacciSeries(limit:Int):Int = {
    @scala.annotation.tailrec
    def fibonacciRecursive(limit:Int, first:Int =0, second:Int = 1): Int = {
      println(first)
      limit match {
        case 0 => first
        case 1 => second
        case _ => fibonacciRecursive(limit - 1, second, first + second)

      }
    }
    fibonacciRecursive(limit)

  }
  fibonacciSeries(7)
}
