//QUESTION-1

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

//QUESTION-2

def area(shape:String,firstDim:Int,secondDim:Int,f:(Int,Int)=>Int):String =
{
  val result = f(firstDim,secondDim)
  shape match {
    case "rectangle" | "rhombus" | "parallelogram"  =>  s"Area of $shape is $result"
    case _ => s"Not yet defined for $shape"
  }
}

area("rectangle",5,4,(a,b)=>(a*b))
area("square",5,4,(a,b)=>(a*b))
area("rhombus",2,4,(a,b)=>(a*b))
area("parallelogram",9,4,(a,b)=>(a*b))


//QUESTION-3

def sum(functionName:String,firstDim:Int,secondDim:Int,f:(Int,Int)=>Int): Int =
{

  functionName match {
    case "square"  => f(firstDim*firstDim,secondDim*secondDim)
    case "cube" => f(firstDim*firstDim*firstDim,secondDim*secondDim*secondDim)
    case "Int" => f(firstDim,secondDim)
    case _ =>  -1
  }
}

sum("square",4,6,(a,b)=>a+b)
sum("hello" ,4,6,(a,b)=> a+b)
sum("cube",4,6,(a,b)=>a+b)
sum("Int",4,6,(a,b)=>a+b)
